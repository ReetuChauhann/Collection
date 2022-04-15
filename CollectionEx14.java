import java.util.*;
import java.util.TreeMap;


public class CollectionEx14 {
    public static void main(String[] args) {
        TreeMap a = new TreeMap();
        a.put("xyz",2);
        a.put("pqr",5);
        a.put("ghg",9);
       //a.put(1,1); //ClasscastException
        a.put("nbv",7);
        a.put("bvc",2);
        System.out.println(a);
        System.out.println(a.get("xyz"));

        Set s = a.entrySet();
        // Iterator i = s.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
        for (Object o : s) {
            System.out.println(o);
            }

            a=new TreeMap();
            a.put(34,10);
            a.put(78,"Ram");
            a.put(98,7.2);
            //a.put("abc",7.2); // Exception Occurred
            a.put(23,10);
            a.put(56,12);
            a.put(31,5);
            System.out.println(a);



        
    }
    
}
