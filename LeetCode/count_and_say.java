// import java.util.Scanner;

// public class count_and_say {
//     public static String function(int n)
//     {
//         if(n==1)
//         {
//             return "1";
//         }
//         String say=function(n-1);

//         //Processing
//         int count=1; 
//         String result="";
//         for(int i=0;i<say.length();i++)
//         {
//             while(i+1 < say.length() && say.charAt(i)==say.charAt(i+1))
//             {
//                 count++;
//                 i++;
//             }
//             result+=String.valueOf(count)+say.charAt(i);
//             count=1;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int digit;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number");
//         digit=sc.nextInt();
//         String result=function(digit);
//         System.out.println("Result will be "+result);
//     }
// }



/////////////////////////////////////////////////////////Returning in Integer

import java.util.Scanner;

public class count_and_say {
    public static Integer function(int n)
    {
        if(n==1)
        {
            return 1;
        }
        String say=function(n-1).toString();

        //Processing
        int count=1; 
         StringBuilder result = new StringBuilder();
        for(int i=0;i<say.length();i++)
        {
            while(i+1 < say.length() && say.charAt(i)==say.charAt(i+1))
            {
                count++;
                i++;
            }
            result.append(count).append(say.charAt(i));
            count=1;
        }
        return Integer.parseInt(result.toString());
    }
    public static void main(String[] args) {
        int digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        digit=sc.nextInt();
        int result=function(digit);
        System.out.println("Result will be "+result);
    }
}
