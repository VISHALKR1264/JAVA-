// public class Longest_palindrome_substring {
//     public static String longestpalindrome(String s)
//     {
//         int n=s.length();
//         int maxlength=0;
//         int[][] dp=new int[n][n];
//         String ans="";
//         for(int dif = 0; dif < n; dif++)
//         {
//             for(int i = 0, j = i + dif; j < n; i++,j++)
//             {
//                 if(i==j)//Diff-->0 first diagonal which have only one element
//                 {
//                     dp[i][j]=1;
//                 }
//                 else if(dif==1)
//                 {
//                     dp[i][j]=(s.charAt(i)==s.charAt(j)) ? 2:0;
                    
//                 }
//                 else
//                 {
//                     if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0)
//                     {
//                         dp[i][j]=dp[i+1][j-1]+2;
//                     }
//                 }
//                 if (dp[i][j]>0 && j-1+1 > maxlength)//Some element is present and that is confirmed that it is an palindrome
//                 {
//                     maxlength = j-i+1;
//                     ans = s.substring(i,j+1);//(i,j+1)
//                 }
//             }
//         }
//         System.out.println("Max length "+maxlength);
//         return ans;
//     }
//     public static void main(String[] args) {
//         String str="aabaa";
//         Longest_palindrome_substring ls=new Longest_palindrome_substring();
//         String ans=ls.longestpalindrome(str);
//         System.out.println("Longest palindrome substring is ---> "+ans);
//     }
// }



///////////////////////////////------------>
//Same code just variable name are changed and iterator has changes to if and else

public class Longest_palindrome_substring {
    public static String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 0;
        int[][] dp = new int[n][n];
        String longestPalindrome = "";

        for (int difference = 0; difference < n; difference++) {
            for (int start = 0, end = start + difference; end < n; start++, end++) {
                if (start == end) {
                    dp[start][end] = 1;
                } else if (difference == 1) {
                    if (s.charAt(start) == s.charAt(end)) {
                        dp[start][end] = 2;
                    } else {
                        dp[start][end] = 0;
                    }
                } else {
                    if (s.charAt(start) == s.charAt(end) && dp[start + 1][end - 1] > 0) {
                        dp[start][end] = dp[start + 1][end - 1] + 2;
                    }
                }
                if (dp[start][end] > 0 && end - start + 1 > maxLength) {
                    maxLength = end - start + 1;
                    longestPalindrome = s.substring(start, end + 1);
                }
            }
        }

        System.out.println("Max length: " + maxLength);
        return longestPalindrome;
    }

    public static void main(String[] args) {
        String str = "aabaa";
        Longest_palindrome_substring ls = new Longest_palindrome_substring();
        String ans = ls.longestPalindrome(str);
        System.out.println("Longest palindrome substring is ---> " + ans);
    }
}
