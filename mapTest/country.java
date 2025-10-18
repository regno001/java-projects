package in.regno.exception.mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class country {
    public static void main(String[] args) {
        Map<String,String> m =new HashMap<>();
        m.put("India","NewDelhi");
        m.put("UnitedState","Washington DC");
        m.put("Nepal","Katmandu");
        m.put("Brazil","Peru");
        m.put("Spain","Barcelona");
        m.put("France","Peris");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country");
        String c= input.next();
        System.out.printf("%s,%s",c,m.get(c));
    }
}
