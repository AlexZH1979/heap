package ru.zhmyd;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import java.lang.management.MemoryUsage;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
       try {
            Thread thread = new Thread(new MemoryListener());
            thread.setDaemon(true);
            thread.start();
            while (true) {
                HeapGarbage heapGarbage = new HeapGarbage();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
