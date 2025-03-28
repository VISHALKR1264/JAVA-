/*ex-> 'abc'-->[a==c]-->false-->so,[i+1,j](ab) & [i,j-1] (bc) repeat this but 2 times 'b'(mid) comes so '-' it by (i+1,j-1);
ex->'aba'-->[a==a]-->true '+1' so,[i+1,j](ab) & [i,j-1] (bc) repeat this here 'mid' come 2 time but no need to - as 1 mid for single palindrome and a mid a always true; */

public class palindromic_subsequence {
    public static int solve(int i, int j, String str) {
        if (i == j) {
            return 1; // A single character is always a palindrome

        }
        if (j < i) {
            return 0;
        }

        if (str.charAt(i) == str.charAt(j)) {
            return 1 + solve(i + 1, j, str) + solve(i, j - 1, str);
        } else {
            return solve(i + 1, j, str) + solve(i, j - 1, str) - solve(i + 1, j - 1, str);// Avoid double counting
        }
    }

    public static void main(String[] args) {
        String str = "abcb";
        int n = str.length();
        System.out.println("TOTAL POSSIBLE PALINDROMIC SUBSTRING :->  " + solve(0, n - 1, str));
    }
}

// import java.util.HashSet;
// import java.util.Set;

// public class palindromic_subsequence {

//     // Set to store unique palindromic subsequences
//     static Set<String> subsequences = new HashSet<>();

//     public static int solve(int i, int j, String str, String current) {
//         if (i > j) {
//             return 0;
//         }
//         if (i == j) {
//             // A single character is always a palindrome
//             subsequences.add(current + str.charAt(i)); // Add the single character
//             return 1;
//         }

//         if (str.charAt(i) == str.charAt(j)) {
//             // Include matching characters at both ends and recurse
//             subsequences.add(current + str.charAt(i) + str.charAt(j));
//             return 1 + solve(i + 1, j, str, current + str.charAt(i)) + solve(i, j - 1,
//                     str, current + str.charAt(j));
//         } else {
//             // Recurse excluding either the start or end characters and avoid double
//             // counting
//             return solve(i + 1, j, str, current) + solve(i, j - 1, str, current) -
//                     solve(i + 1, j - 1, str, current);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abaa";
//         int n = str.length();
//         solve(0, n - 1, str, "");

//         System.out.println("Total possible palindromic subsequences: " +
//                 subsequences.size());
//         System.out.println("All unique palindromic subsequences:");

//         for (String subsequence : subsequences) {
//             System.out.println(subsequence);
//         }
//     }
// }
