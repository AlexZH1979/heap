package ru.zhmyd;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            //List<List<Object>> list = new ArrayList<>();
            Thread thread = new Thread(new MemoryListener());
            thread.setDaemon(true);
            thread.start();
            while (true) {
                //list.add(new ArrayList<>(100));
                HeapGarbage heapGarbage = new HeapGarbage();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
