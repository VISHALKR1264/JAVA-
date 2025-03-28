import java.util.HashMap;
import java.util.Map;

public class Map_framework {
    public static void main(String[] args) {
        //It represent a collection of key and value pair 
        //Key is unique were value may be duplicate
        Map<Integer,String> mp=new HashMap<>();//default cap is 16
        mp.put(1, "mohan");
        mp.put(2, "aryan");
        mp.put(3, "rahul");
        mp.put(4, "sonal");
        mp.put(6, "sonal");
        System.out.println(mp);
        System.out.println(mp.get(2));//To get specific value  
        System.out.println(mp.get(5));//if not value at that key it peint null
        mp.remove(6);
        mp.remove(2, "aryan");
        System.out.println(mp);
        System.out.println("Contain that key :- "+mp.containsKey(3));
        System.out.println("Contain that value :- "+mp.containsValue("rahul"));        
        System.out.println("Return all the KeySet :- "+mp.keySet());
        System.out.println("Return all the values:- "+mp.values());
        System.out.println("Return all the entrySet :- "+mp.entrySet());


        Map<Integer,Integer> mp1=new HashMap<>();
        mp1.put(1, 80);
        mp1.put(2, 50);
        mp1.put(3, 20);
        mp1.put(4, 30);
        // mp.putAll(mp1);
        mp1.clear();
        System.out.println(mp1);
        System.out.println("Map is Empty or not :- "+mp1.isEmpty());
    }
}
