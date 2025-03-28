// public class vowel_remove {
//    public static String removeVowels(String input) {
//         StringBuilder result = new StringBuilder();

//         for (char c : input.toCharArray()) {
//             if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
//                     c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
//                 result.append(c);
//             }
//         }

//         return result.toString();
//     }
    
//         public static String removeVowels_sort_method(String input) {
//             return input.replaceAll("[AEIOUaeiou]", " ");
//         }
    
    
//     public static void main(String[] args) {
//         String str ="pppp";
//         String ans=removeVowels_sort_method(str);
//         // String ans=removeVowels(str);
//         System.out.println(ans);
//     }
// }










//Vowel count
class vowel_remove{
    public static void main(String[] args) {
        String str="vishal";
        str=str.toLowerCase();
        int count=0;

        if (str == null || str.isEmpty()) {
            System.out.println("No Array is There");
        }
        StringBuilder sb=new StringBuilder();
        for (char ch : str.toCharArray())
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
            else
            {
                sb.append(ch);
            }
        }
        System.out.println("NO of Vowels in this Input " +count +" , The String after removing Vowels is  :-->  "+sb);
    }
}
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class VowelCounterRegex {
//     public static void main(String[] args) {
//         String input = "Hello, World!"; // Example string
//         int vowelCount = countVowels(input);
//         System.out.println("Number of vowels: " + vowelCount);
//     }

//     public static int countVowels(String str) {
//         if (str == null || str.isEmpty()) {
//             return 0;
//         }

//         // Define a regex pattern for vowels
//         Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
//         Matcher matcher = vowelPattern.matcher(str);

//         int count = 0;
//         // Find all matches of vowels in the string
//         while (matcher.find()) {
//             count++;
//         }

//         return count;
//     }
// }
