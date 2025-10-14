package in.regno.exception.Collection;

import java.util.ArrayList;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Regno");
        a.add("Rawat");
        



        a.add(1,"pradeep");

        for (int i=0;i< a.size();i++){
            System.out.println(a.get(i));
        }
         a.remove(0);
        System.out.println(a.get(0));
        a.set(0,"shubham");
        System.out.println(a.get(0));
         if (a.contains("regno")){
             System.out.println("Regno is here");
         }else{
             System.out.println("dident exist right now ");
         }
         if (a.contains("shubham")){
             System.out.println(a.indexOf("shubham"));
         }


    }
}
