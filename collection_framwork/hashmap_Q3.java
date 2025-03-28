//Find Itinerary from Tickets
//Hashmap of <String,String>given,
//first we have to find the start A/q to tickets
//To find start
//From------>To
//jo same from me ho but To me naa ho wahi hamara start hoga
//So ham containKey se search kr skte h ki wo availabe hai y nhi to value me krna h hame "To" k lye se reverse map banana hoga
//Jisme Key-->Value & Value-->Key
//Now loop chalao purana Key me or check kro same key reverse map me h jo nhi hua wahi hamara start ho jaye g

import java.util.*;

public class hashmap_Q3 {
    public static String getStart(HashMap<String, String> tick) {
        // Reverse Map is created
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tick.keySet()) {
            // Key-->key;-->Using this loop condition
            // value-->tick.get(key)
            revMap.put(tick.get(key), key);// reverse daal dia
        }
        // For loop on my original map

        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
               return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        HashMap<String,String> tickets= new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");        

        String start=getStart(tickets);
        while (tickets.containsKey(start)) {
            System.out.print(start+"-->");
            start=tickets.get(start);
        }
        System.out.print(start);

    }
}  
