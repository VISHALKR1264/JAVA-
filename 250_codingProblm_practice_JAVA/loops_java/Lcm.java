
public class Lcm {
    public static int gcd(int a,int b)
    {
        while (a != b) {
            if (a > b) {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
            
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a=2,b=3;
        System.out.print(Math.abs(a*b)/gcd(a,b));
    }
}
