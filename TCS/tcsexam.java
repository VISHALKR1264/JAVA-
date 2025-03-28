import java.util.Scanner;

public class tcsexam {
    // public static int function2(int digit)
    // {
    //     int fact=1;
    //     for(int i=1;i<=digit;i++){    
    //         fact=fact*i;    
    //     }    
    //     return fact;
    // }
    public static int function2(int digit)
    {
        if(digit ==0)
        {
            return 1;
        }
        else
        {
            return (digit * (function2(digit-1)));
        }
    }
    public static void function(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int number = arr[i];
            while (number > 0) {
            int digit=number % 10;
            int factorial=function2(digit);
            sum += factorial;
            number=number/10;
            
            }
            
            if(sum== arr[i])
            {
                System.out.println( arr[i]+" is a super number");
            }
            else{
                System.out.println(arr[i]+" Not a super number");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        function(arr);
    }
}
