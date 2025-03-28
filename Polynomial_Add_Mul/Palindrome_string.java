public class Palindrome_string {
    // public static boolean palindrome(String str)
    // {
    //     int i=0,j=str.length()-1;
    //     str=str.toLowerCase();
    //     while (i<j) {
    //         if(str.charAt(i) != str.charAt(j))
    //         {
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
    public static Boolean palindrome(String str)
    {
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        String revstr=sb.reverse().toString();
        if(revstr.equals(str))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="Naman";
        boolean result= palindrome(str);
        System.out.println(result);
        
    }
}
