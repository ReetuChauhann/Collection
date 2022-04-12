import java.util.*;

public class CollectionEx5 {

    public static void main(String[] args){
        //HashSet a = new HashSet();
        ArrayList a = new ArrayList();
        a.add(65);
        a.add(34);
        a.add(34);
        a.add("reetu");
        a.add("tanu");
        System.out.println(a);
    //     for (Object o : a) {
    //         System.out.println(o);
    //  error a.remove(o) //for each loop can only read the objects from  the collection cant modify the objects!
    //         }

            Iterator i = a.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
                i.remove(); //Allowed
            }
            System.out.println(a);


            
        }
    
}
