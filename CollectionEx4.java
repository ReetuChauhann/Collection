import java.util.*;

public class CollectionEx4 {
    public static void main(String[] args){
        TreeSet a = new TreeSet();
        a.add(34);
        a.add(47);
        a.add(32);
        a.add(31);
       // a.add("dhwgfd"); // error bcoz data should be of same kind either all are numbers or string cant be both
        a.add(45);
        System.out.println(a);
        for (Object o : a) {
            System.out.println(o);

            
        }

        TreeSet b = new TreeSet();
        b.add("ram");
        b.add("sham");
        b.add("naman");
       // b.add(45); will give an error
        b.add("aman");
        System.out.println(b);
        for (Object o : b) {
            System.out.println(o);
            
        }




    }
     
}
