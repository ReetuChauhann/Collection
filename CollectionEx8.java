import java.util.ArrayList;

import java.util.*;
public class CollectionEx8 {
    
    public static void main(String[] args){

      //  ArrayList a = new ArrayList();
          Vector a = new Vector();
          a.add(34);
          a.add(3);
          a.add("Tanu");
          a.add("Reetu");
          a.add(56);
          System.out.println(a);

          a.remove(3); // remove according to the indexing
          a.remove((Integer)3); // remove according to the Object

          System.out.println(a);



          Iterator i = a.iterator();
          while(i.hasNext()){
              System.out.println(i.next());
          }

          Enumeration e = a.elements();
          while(e.hasMoreElements()){
              System.out.println(e.nextElement());
          }


    }
}
