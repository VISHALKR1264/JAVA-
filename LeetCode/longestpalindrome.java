public class Longest_palindrome_substring {
    public static String longestpalindrome(String s)
    {
        int n=s.length();
        int maxlength=0;
        int[][] dp=new int[n][n];
        String ans="";
        for(int dif = 0; dif < n; dif++)
        {
            for(int i = 0, j = i + dif; j < n; i++,j++)
            {
                if(i==j)//Diff-->0 first diagonal which have only one element
                {
                    dp[i][j]=1;
                }
                else if(dif==1)
                {
                    dp[i][j]=(s.charAt(i)==s.charAt(j)) ? 2:0;
                    
                }
                else
                {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0)
                    {
                        dp[i][j]=dp[i+1][j-1]+2;
                    }
                }
                if (dp[i][j]>0 && j-1+1 > maxlength)//Some element is present and that is confirmed that it is an palindrome
                {
                    maxlength = j-i+1;
                    ans = s.substring(i,j+1);//(i,j+1)
                }
            }
        }
        System.out.println("Max length "+maxlength);
        return ans;
    }
    public static void main(String[] args) {
        String str="aabaa";
        Longest_palindrome_substring ls=new Longest_palindrome_substring();
        String ans=ls.longestpalindrome(str);
        System.out.println("Longest palindrome substring is ---> "+ans);
    }
}
