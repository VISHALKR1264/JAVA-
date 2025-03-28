
public class Fibonacci_Series {
    public static int fibonacci(int n)

    {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        int f=0,s=1;
        System.out.printf(f +" "+ s );
        for(int i=2;i < n;i++)
        {
            int next=f+s;
            System.out.printf(" "+next);
            f=s;
            s=next;
        }


        //Other way
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
