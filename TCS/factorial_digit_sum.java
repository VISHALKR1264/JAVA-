import java.util.ArrayList;
import java.util.List;

public class factorial_digit_sum {
    public static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*(factorial(n-1));
    }
    public static void main(String[] args) {
        int n=321;
        int sum=0;
        List <Integer> store_fact = new ArrayList<>();
        while(n>0)
        {
            int digit=n%10;
            int fact=factorial(digit);
            sum+=fact;
            store_fact.add(fact);
            n=n/10;
        }
        System.out.println("Factorials of each digit (from first to last):");
        for (int i = store_fact.size() - 1; i >= 0; i--) {
            System.out.println(store_fact.get(i));
        }
        System.out.println("Sum is "+sum);
    }
}
