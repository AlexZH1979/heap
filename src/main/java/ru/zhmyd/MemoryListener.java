package ru.zhmyd;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.Iterator;

public class MemoryListener implements Runnable {
    @Override
    public void run() {

        while (true) {

            Iterator<MemoryPoolMXBean> iter = ManagementFactory.getMemoryPoolMXBeans().iterator();
            while (iter.hasNext()) {
                MemoryPoolMXBean item = iter.next();
                String name = item.getName();
                if(name.equals("PS Old Gen")||name.equals("PS Eden Space")||name.equals("PS Survivor Space")) {
                    MemoryUsage usage = item.getUsage();
                    System.out.print("Name:" + name + " [ used: " + usage.getUsed() + " ; max: " + usage.getMax() + "]; ");
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}
