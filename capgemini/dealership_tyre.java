import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dealership_tyre {
    public static void main(String[] args) {
        int dealership = 3;
        int car = 0, bike = 0;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= dealership; i++) {

            System.out.println("No of Cars and Bikes at dealer " + i);
            car = sc.nextInt();
            bike = sc.nextInt();

            int tyre = (4 * car) + (2 * bike);
            map.put(i, tyre);

            car = 0;
            bike = 0;
        }
        System.out.println(map);

        int maxTyre = Collections.max(map.values());
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxTyre == entry.getValue()) {
                System.out.println("Dealer " + entry.getKey() + " has the maximum number of tyres: " + maxTyre);

            }
        }

    }
}



// public class dealership_tyre {
//     public static void main(String[] args)
//    {
//         Scanner sc=new Scanner(System.in);
//         int dealership=sc.nextInt();
//         while(dealership-->0)
//        {
//             int cars=sc.nextInt();
//             int bikes=sc.nextInt();
//             System.out.println(cars*4+bikes*2);           
//        }
//    }

// }