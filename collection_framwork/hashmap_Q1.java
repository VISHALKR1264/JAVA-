///////////---------------------------------------->
//Majority_element problem

// public class hashmap_Q1 {
//     //Time Complexity is O(n^2)
//     //Using array
//     public static int majority_element(int num[]) {
//         int count = 0;
//         int n=num.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (num[j] == num[i]) {
//                     count++;
//                 }
//                 if (count > n / 3) {
//                     return num[i];
//                 }
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int num[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
//         int maj = majority_element(num);
//         System.out.println(maj);

//     }
// }

import java.util.HashMap;

public class hashmap_Q1 {
    //Using HashMap
    public static void majorityelement(int num[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = num.length;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(num[i])) {
                hm.put(num[i], hm.get(num[i]) + 1);
            } else {
                hm.put(num[i], 1);
            }
        }
        for (int key : hm.keySet()) {
            if (hm.get(key) > n / 3) {
                System.out.println(key);
            }
        }

    }

    public static void main(String[] args) {
        // Majority Element
        // given an Integer array of size n, find all elements that appear more
        // than[n/3] times.
        // num[]={1,3,2,5,1,3,1,5,1}-->n=9 so 9/3=3
        // 1-->comes more than 3 time
        int num[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        majorityelement(num);
        // If method is non static then,
        // hashmap_Q1 h=new hashmap_Q1();
        // h.majorityelement(num);

    }
}

// /**
// * hashmap_Q1
// */
// public class hashmap_Q1 {
// //Moore's Voting algorithim
// // Best and optimal solution will be O(n)
// public static int majority_element(int num[]) {
// int count = 0;
// ;
// int el = -1;
// int n = num.length;
// for (int i = 0; i < n; i++) {
// if (count == 0) {
// count = 1;
// el = num[i];
// } else if (num[i] == el) {
// count++;
// } else {
// count--;
// }

// }
// // At this point we know if any majority element is present in this array
// that
// // will be only this no one else
// // for checking that how many time that specific element occur and it fulfil
// our
// // condition of n/3 or not
// int count2 = 0;
// for (int i = 0; i < n; i++) {
// if (num[i] == el)
// count2++;
// }
// if (count2 > n / 3) {
// System.out.println("It appears " + count2 + " Times");
// return el;
// }
// return -1;
// }

// public static void main(String[] args) {
// int num[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
// int maj = majority_element(num);
// System.out.println("Majority element is " + maj);
// }
// }


