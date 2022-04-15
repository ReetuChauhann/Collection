import java.util.*;

public class CollectionEx11 {

    public static void main(String[] args) {
        HashMap a = new HashMap();
        a.put("xyz", 1);
        a.put(1,2);
        a.put(2,56);
        a.put(3,77);
        a.put(4,78);
        a.put(5,78);
        a.put(6,79);
        // System.out.println(a);
        // System.out.println(a.get(1));

        // Set s = a.entrySet(); //getting all the entries(key,value)
        // Iterator i = s.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
 
        // Set s = a.keySet();       //getting all the keys here
        // Iterator i = s.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

         Set s = a.keySet();
         Iterator i = s.iterator();
         while(i.hasNext()){
             System.out.println(a.get(i.next())); // getting all the values
         }
        


    }
    
}
