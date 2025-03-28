// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;

// public class Hash_map {
//     public static void main(String[] args) {
//         //Implemented class of Map Interface
//         //Best Time complexity O(1)
//         //HashMap internally implemented as a Array of LinkList
//         //Underline DS of HashTable
//         //It store key and value pair known as Entry
//         //Key is always unique but value can be duplicate
//         //It can contain max 1 null Key but multiple null in value
//         //Heterogeneous datatype
//         //not follow sorting and Insertion and it is non-synchronized

//         HashMap hs=new HashMap();
//         //Insertion
//         hs.put(null, null);
//         hs.put(1, null);
//         hs.put(2, 10);
//         hs.put(3, "vishal");
//         hs.put(4, "aryan");
//         hs.put("ram", "ramlala");
//         System.out.println(hs);
//         if (hs.containsKey("ram")) {
//             System.out.println("Key is present :-"+ hs.get("ram"));
//         }
//         else
//         {
//             System.out.println("Not present");
//         }

//         //for(val : collection)-->to retrive data one by one 
//         //Iteration in HashMap
//         HashMap <String,Integer> map=new HashMap<>();
//         map.put("one", 11);
//         map.put("two", 22);
//         map.put("three", 33);
//         map.put("four", 44);

//         for(Map.Entry<String,Integer> e : map.entrySet())
//         {
//             System.out.println(" "+e.getKey());
//             System.out.println(" "+e.getValue());
//         }   
//         //for only keys
//         Set <String> keys=map.keySet();
//         for(String key:keys)
//         {
//             System.out.println(key+" "+map.get(key));
//         }
//     }
// }

//////////////////------->
//////////////////////////////////////////--------------------->
//Internal Structure of HashMap how it actually works 
/**
 * Hash_map
 */

import java.util.*;

import org.w3c.dom.Node;

public class Hash_map {
    static class HashMap<K, V> { // generic k,v if dont know the type
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - buckets
        // type of bucket like "int arr[]" array of type int
        private LinkedList<Node> buckets[]; // N = buckets.length , type-->LinkedList of node,,Isi me sara data store
                                            // hoga in LinkedList formate

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;//Size of Bucket
            this.buckets = new LinkedList[4];// Initilaized the array
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();// At every bucket a empty LinkList is created
            }
        }

        private int hashFunction(K key) //-->Put
        {
            int bi = key.hashCode();// it return any value +ve and -ve but we want only +ve so,
            return Math.abs(bi) % N;// -ve -->+ve by cal its mod & our bucket value is always 0 to N-1;
            
        }

        private int searchInLL(K key, int bi)//-->put
         {
            //Which LinkList
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash()//-->put 
        {
            // To do that every element of current bucket have to store somewere after then
            // creating a double size array i.e. lembda<=K
            LinkedList<Node> oldBucket[] = buckets;// purana data ko store kia oldbucket me
            buckets = new LinkedList[N * 2];// ab khali hone k baat uska size doubel kia
            // Har ek me khali linklist v banana hoga
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();// har ek bucket me khali linklist
            }
             // purana bucket jaha store kia the uska loop chalana hai
            // Har bucket k index pr ek linklist store hoga uska v loopp chalana h
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];// har bucket k index pr stored h ek linklist jisme purana data h
                for (int j = 0; j < ll.size(); j++)// loop for that linklist
                {
                    // Linklist k ek ek node nikalna h or call the put function
                    Node node = ll.get(j);
                    put(node.key, node.value);// It always add element to the new bucket
                }
            }
        }

        public void put(K key, V value) {
            // First to check it exist or not so, find the bucket index
            int bi = hashFunction(key);// It take take and gives the bucket index
            // know check to every node of linklist that the key is present or not
            int di = searchInLL(key, bi); // di = -1 ,key and bucket index passes to search on the Linklist
            if (di == -1) { // key doesn't exist
                buckets[bi].add(new Node(key, value));// Agar exit nhi krta h to us Linklist me add krna hoga
                n++;
            } else { // key exists
                Node node = buckets[bi].get(di);// agr hai to kya date h uska Node data me store kre g or new value se
                // replace kre ge
                node.value = value;
            }
            // Now we check Lembda(2) >= n --->for O(1)
            double lambda = (double) n / N;

            if (lambda > 2.0) {
                //Rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return false;
            } else { // key exists
                return true;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // di = -1
            if (di == -1) { // key doesn't exist
                return null;
            } else { // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) { // di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);
        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }
}
