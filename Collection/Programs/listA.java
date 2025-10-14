package in.regno.exception.Collection.Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listA {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
                l.add(2);
                l.add(3);
                l.add(2);
                l.add(4);


        System.out.println(Collections.binarySearch(l,3));
    }

}
