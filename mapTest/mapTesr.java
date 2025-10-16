package in.regno.exception.mapTest;

import java.util.HashMap;
import java.util.Map;

public class mapTesr {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("Prashant",34);
        m.put("Rahul",32);
        m.put("Sumit",100);
        m.put("Praful",200);
        m.put("Preeti",3221);
        m.put("Praneet",452);
        System.out.println(m.size());
        System.out.println(m.get("Prashant"));
        System.out.println(m.containsKey("Rahul"));
        System.out.println(m.containsKey("Ankita"));
        System.out.println(m.remove("Praful"));
        System.out.println(m.size());
        for (String key:m.keySet()){
            System.out.printf("%s :%s\n",key,m.get(key));
        }
    }
}
