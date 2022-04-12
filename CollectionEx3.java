import java.util.*;


public class CollectionEx3 {
    public static void main(String[] args){

       // HashSet a = new HashSet(); //stores objects randomly
       LinkedHashSet a = new LinkedHashSet(); //subclass of HashSet :stores objects with sequence
        a.add("Tanu");
        a.add("Reetu");
        a.add(32);
        a.add(56);
        a.add(54);
        a.add(54);  
      
     // a.remove("Tanu"); 
     
       System.out.println(a); 
       a.remove(32); 
       //a.remove((Interger)32); why it is giving me an error
        System.out.println(a);

        // for (Object o : a) {
        //          System.out.println(o);

        // }
        
        
        
    }
    
}
