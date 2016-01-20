package ru.zhmyd;

import java.util.ArrayList;
import java.util.List;


public class HeapGarbage {
    private List list = new ArrayList(10000);
    @Override
    public void finalize(){
        while(true){
        }
    }
}
