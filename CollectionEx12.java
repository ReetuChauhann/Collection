import java.util.*;

public class CollectionEx12 {

    public static void main(String[] args) {
        LinkedHashMap a = new LinkedHashMap(); //subClass of HashMap // Store with sequence(in which they are added)
        a.put(1, "Reetu");
        a.put(2, "Tanu");
        a.put(4, "Neha");
        a.put(3, "Meenu");
        a.put(5, "Chintu");
        // System.out.println(a);
        // System.out.println(a.get(3));

        Set s = a.entrySet();
        // Iterator i = s.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        for (Object o : s) {
            System.out.println(o);
             }
    }
    
}
