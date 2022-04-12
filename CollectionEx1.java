import java.util.*;

public class CollectionEx1 {

       public static void main(String[] args){
           HashSet a= new HashSet();
           a.add("reetu");
           a.add("tanu");
           a.add(10);
           a.add(12);
           a.add(12);
           a.add(15);
           System.out.println(a);
           a.remove("tanu");
           System.out.println(a);
           System.out.println(a.size()); //its return type is int(will tell how many are there in a collection)
           //System.out.println(a.get(1)); //in hashset it will give an error bcoz indexing is not allowed
       }
    
}
