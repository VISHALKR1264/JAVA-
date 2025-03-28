import java.util.HashMap;
import java.util.Map;

public class max_occuring_element {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 70 ,7,7,7,7};
        Map<Integer,Integer> hash = new HashMap<>();
      
        // for (int num : arr) {
        //     hash.put(num, hash.getOrDefault(num, 0) + 1);
        // }
        for (int num : arr) {
            if(hash.containsKey(num))
            {
                hash.put(num, (hash.get(num)+1));
            }
            else{

                hash.put(num, 1);
            }
            
        }
        System.out.println(hash);
        int maxElement = -1;
        int maxCount = 0;

        for(int key : hash.keySet())
        {
            int count =hash.get(key);
            System.out.println(count);
            if(count > maxCount)
            {
                maxCount=count;
                maxElement=key;
            }

        }
        System.out.println("Maximun occuring element is "+maxElement +" with the maxCount of  "+maxCount);



      
    }
}
