// import java.util.HashSet;

// public class LongestSubstringWithoutRepeatingCharacters {
//     public static int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int start = 0, end = 0;
//         int maxLength = 0;

//         HashSet<Character> set = new HashSet<>();

//         while (start < n) {
//             if (!set.contains(s.charAt(start))) {
//                 set.add(s.charAt(start));
//                 maxLength = Math.max(maxLength, start - end + 1);
//                 start++;
//             } else {
//                 set.remove(s.charAt(end));
//                 end++;
//             }
//         } 

//         return maxLength;
//     }

//     public static void main(String[] args) {
//         String input = "abcabcbb";
//         int result = lengthOfLongestSubstring(input);
//         System.out.println("Output: " + result);
//     }
// }
//////////////////////////////////------------>
// // //Longest substring count only it show we storing max only
// import java.util.HashSet;

// public class LongestSubstringWithoutRepeatingCharacters {
//     public static int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int start = 0, end = 0;
//         int maxLength = 0;

//         HashSet<Character> set = new HashSet<>();

//         while (start < n) {
//             //First check that set me koi char hai y nhi agr nhi h '!' toh add kr first char ko 
//             if (!set.contains(s.charAt(start)))//Har ek element ko check krna h or element is in string formate se charAt se ek ek char aaye g 
//             {
//                 set.add(s.charAt(start));

//                 if (start - end + 1 > maxLength) {
//                     maxLength = start - end + 1;
//                 }
//                 // maxLength = Math.max(maxLength, start - end + 1);
//                 start++;
//             } else {
//                 set.remove(s.charAt(end));
//                 end++;
//             }
//         }

//         return maxLength;
//     }

//     public static void main(String[] args) {
//         String input = "abcabcbb";
//         int result = lengthOfLongestSubstring(input);
//         System.out.println("Output: " + result);
//     }
// }


// //Longest substring count with substring
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static String lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0;
        int maxLength = 0;
        int maxSubstring_start=0;

        HashSet<Character> set = new HashSet<>();

        while (start < n) {
            //First check that set me koi char hai y nhi agr nhi h '!' toh add kr first char ko 
            if (!set.contains(s.charAt(start)))//Har ek element ko check krna h or element is in string formate se charAt se ek ek char aaye g 
            {
                set.add(s.charAt(start));

                if (start - end + 1 > maxLength) {
                    maxLength = start - end + 1;
                    maxSubstring_start=end;//Storing the starting point of LongSubstring;
                }
                // maxLength = Math.max(maxLength, start - end + 1);
                start++;
            } else {
                set.remove(s.charAt(end));
                end++;
            }
        }
        String LongSubstring=s.substring(maxSubstring_start, maxSubstring_start + maxLength);

        return LongSubstring +" With MaxLength "+ maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = lengthOfLongestSubstring(input);
        System.out.println("Output: " + result);
    }
}

///------------------>
//Using hashmap we will give the size of map will show the max_length of subsstring and it store the value also

// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.Map;

// /**
//  * LongestSubstringWithoutRepeatingCharacters
//  */
// public class LongestSubstringWithoutRepeatingCharacters {

//    public static void LayerInstantiation(String s)
//     {
//         String substring=null;
//         int Max_length_substring=0;
//         Map<Character,Integer> map=new HashMap<>();
//         char[] arr=s.toCharArray();//string converted to an char array
//         for(int i=0;i<arr.length;i++)
//         {
//             char ch=arr[i];
//             if(!map.containsKey(ch))//This condition checks if the character ch is not already present in the map. If it's not present, it means this character is encountered for the first time in the current substring.
//             {
//                 map.put(ch, i);//j--0,a--1,v--2
//             }
//             else//if some char is alredy there in map indicates a repeating char 
//             {
//                 i=map.get(ch);
//                 map.clear();//removing all entries. This is done to start fresh for the next potential substring without repeating characters.
//             }
//             if(map.size()>Max_length_substring)
//             {
//                 Max_length_substring=map.size();
//                 substring=map.keySet().toString();
//             }
//         } 
//         System.out.println("the Longest Substring"+substring);
//         System.out.println("the Max length "+Max_length_substring);
//     }
//     public static void main(String[] args) {
//         LongestSubstringWithoutRepeatingCharacters repeatchar =new LongestSubstringWithoutRepeatingCharacters();
//         repeatchar.LayerInstantiation("java");
//     }
// }