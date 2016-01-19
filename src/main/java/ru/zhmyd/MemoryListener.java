package ru.zhmyd;

/**
 * Created by Aliaksandr_Zhmaidzia on 1/19/2016.
 */
public class MemoryListener implements Runnable{
    @Override
    public void run() {

        while (true){

            System.out.println("Free memory: "+Runtime.getRuntime().freeMemory());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
