package in.regno.exception.Collection;

import java.util.HashSet;
import java.util.Set;

public class setTest {
    public static void main(String[] args) {
        Set<String>  name = new HashSet<>();
        name.add("Rahul");
        name.add("Rakji");
        name.add("Praful");
        name.add("Surendra");
        name.add("Regno");
        name.add("Virendra");
        utility.print(name);
        System.out.println(name.add("Prashant"));
        System.out.println(name.add("Prashant"));
        System.out.println(name.size());
        System.out.println(name.contains("Rahul"));
        System.out.println(name.remove("Rahul"));
        utility.print(name);
    }
}
