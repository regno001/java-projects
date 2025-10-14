package in.regno.exception.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> l =new ArrayList<>();
        l.add(1);
        l.add(22);
        l.add(4);
        l.add(75);
        l.add(2);
        l.add(54);
        l.add(64);
        l.add(43);
        utility.print(l);
        Collections.sort(l);
        utility.print(l);
        Collections.reverse(l);
        utility.print(l);
        Collections.shuffle(l);

    }
}
