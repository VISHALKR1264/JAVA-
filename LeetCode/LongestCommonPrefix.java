import java.util.*;
class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        // Arrays.sort(strs);
        // String str1 =strs[0];
        // String str2 =strs[strs.length-1];
        // int minLen = Integer.MAX_VALUE;
        // for (String str : strs) {
        //     if (str.length() < minLen) {
        //         minLen = str.length();
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<minLen;i++)
        // {
        //     if(str1.charAt(i)==str2.charAt(i))
        //     {
        //         sb.append(str1.charAt(i));
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
        // return sb.toString();
        ////////////////////////////////////////////////////

        Arrays.sort(strs);
        String str1 =strs[0];
        String str2 =strs[strs.length-1];
        int index=0;
        while(index<str1.length()&& index<str2.length())        {
            if(str1.charAt(index) == str2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
        }
        return index == 0?"":str1.substring(0,index);

        // /////////////////////////////////////////////////////
        // Arrays.sort(strs);
        // String str1 =strs[0];
        // String str2 =strs[strs.length-1];
        // int index=0;
        // while(index<strs.length)
        // {
        //     if(str1.charAt(index) == str2.charAt(index))
        //     {
        //         index++;
        //     }
        //     else
        //     {
        //         break;
        //     }
        // }
        // return index == 0?"":str1.substring(0,index);
    }
    public static void main(String[] args) {
        String arr[]={"flower","floor","flue"};
        LongestCommonPrefix lcf=new LongestCommonPrefix();
        String lc=lcf.longestCommonPrefix(arr);
        System.out.println("Longest common prefix ---"+lc);
    }
}