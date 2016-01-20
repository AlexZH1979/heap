package ru.zhmyd;

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
