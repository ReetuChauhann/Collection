import java.util.*;

public class CollectinEx6 {

    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add(45);
        a.add("tanu");
        a.add(5);
        a.add(65);
        a.add(75);
        a.add("reetu");
        System.out.println(a);
        System.out.println(a.size());


        //to get onject in reverse order
        for(int x =a.size()-1; x>=0; x-- )
          System.out.println(a.get(x));
 
        Iterator i = a.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());

        ListIterator l = a.listIterator(); //ListIterator(sub interface of Iterator) works with List ONLY (not with Set or Map)
        System.out.println(l.next());
        System.out.println(l.next());
        System.out.println(l.next());
        System.out.println(l.previous());
        System.out.println(l.previous());


    }
    
}
