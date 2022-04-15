import java.util.*;

public class CollectionEx10 {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        // a.addFirst(10);  //FILO //o/p will be  30 20 Reetu Ram 10 //Stack type Data structure
        // a.addFirst("Ram");
        // a.addFirst("Reetu");
        // a.addFirst(20);
        // a.addFirst(30);

        // a.addLast(10); // LIFO // o/p will be 10 Ram 30 Tanu 40 //Queue type Data structure
        // a.addLast("Ram");
        // a.addLast(30);
        // a.addLast("Tanu");
        // a.addLast(40);

        // how it is different from the previous Arraylist and vectorlist

        a.addLast(20);  // created a new type of Data structure 
        a.addLast(10);   // o/p will be one ram 20 10 xyz!
        a.addFirst("ram");
        a.addFirst("One");
        a.addLast("xyz");

        Iterator i = a.iterator();
        while(i.hasNext()){
        System.out.println(i.next());
        }


    }
    
}
