import java.util.*;

public class CollectionEx9 {

    public static void main(String[] args){
        HashSet a = new HashSet();
        a.add("reetu");
        a.add("tarun");
        a.add("naman");
        a.add("neeru");

        // Iterator i = a.iterator();
        // while(i.hasNext()){
        //                       String b = (String)i.next();
        //                       if(b.startsWith("n")){
        //                           i.remove();
        //                       }
        //                    System.out.println(a);   

        Iterator i = a.iterator();
        while(i.hasNext()){
                              String b = (String)i.next();
                              if(b.startsWith("n")){
                                  i.remove();
                              }
                           System.out.println(a);  
        }

    }
    
}
