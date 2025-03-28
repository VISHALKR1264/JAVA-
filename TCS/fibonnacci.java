import java.util.Scanner;

/**
 * fibonnacci
 */
public class fibonnacci {

    public static int factorialSum(int n)
    {
        if(n <= 0)
        {
            return 0;
        }
        int fibo[]=new int[n+1];
        fibo[0]=0;fibo[1]=1;
        int sum = fibo[0] + fibo[1];
        for(int i=2;i<=n;i++)
        {
            fibo[i] = fibo[i-1] + fibo[i-2];
            sum += fibo[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of 'n'");
        int n=sc.nextInt();
        int a=0,b=1;
        int c;
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;  
        }
        System.out.println("  Sum :--> "+factorialSum(n));
    }
}