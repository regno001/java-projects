package in.regno.exception.Collection.Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListC {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        for (int i: l){
            System.out.print(i);
        }
        System.out.println();
        Collections.swap(l,1,2);
        for (int i:l){
            System.out.print(i);
        }

    }
}
