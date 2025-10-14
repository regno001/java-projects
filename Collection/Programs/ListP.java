package in.regno.exception.Collection.Programs;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListP {
    public static void main(String[] args) {
        List<Integer> l =new ArrayList();
        l.add(10);
        l.add(30);
        l.add(40);
        l.add(12);
        l.add(32);
        for (int i:l){
            System.out.println(i);
        }
        Collections.sort(l);
        Collections.reverse(l);
        for (int i:l){
            System.out.print(i);
        }
    }
}
