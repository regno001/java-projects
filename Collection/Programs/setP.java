package in.regno.exception.Collection.Programs;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class setP {
    public static void main(String[] args) {
        Set<Integer> s= new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        for(int i:s){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print(s.size());
        System.out.println();
        
        for(int i:s){
            System.out.print(i);
        }
    }
}
