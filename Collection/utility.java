package in.regno.exception.Collection;

import java.util.Collection;
import java.util.Objects;

public class utility {
    public static <E> void print(Collection<E> collection){
      for(E coll: collection){
        System.out.printf("%s ",coll);
    }
        System.out.println();
}
}
