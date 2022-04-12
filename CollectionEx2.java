import java.util.*;

public class CollectionEx2 {

    public static void main (String[] args){

          ArrayList a = new ArrayList();
          a.add("Reetu");
          a.add("Tanu");
          a.add(45);
          a.add("Tanu");
          a.add(76);
          //System.out.println(a);
          System.out.println(a.get(1)); //Indexing is allowed
          for (Object o : a) {
              System.out.println(o);
          }
          System.out.println(a.size()); //return type is int

    }
    
}
