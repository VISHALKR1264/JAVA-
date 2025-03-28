import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
        //It use all methods of Collection and Set Interface
        //hashset is backed by Map
        //hashset underline data structure is hashtable
        //it store heterogeneous data type
        //not folow both insertion order or shorting
        //Non-Synchronized


        //Set-->
        //It is not an Index based it store the data a/q to Hashcode value
        //Not able to store the duplicate value 
        //Only able to store one null value 
        //It does'nt follow the insertion order
        HashSet<String> hs = new HashSet<>();
        hs.add("vishal");
        hs.add("Rajveer");
        hs.add("sachin");
        hs.add("mohan");
        System.out.println(hs);
        System.out.println();
          // If you want to print each element separately, you can use iteration
          for (String element : hs) {
            System.out.println(element);
        }
        System.out.println("One by One elements  :--");
        Iterator itr =hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());            
        }
        
    }
}
