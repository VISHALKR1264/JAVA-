import javax.management.relation.Relation;

public class LCM_GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
    public static int gcd_2(int a, int b) {
        // Euclidean algorithm
        while (a != b) {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }

        }
        return a;
        // GCD and LCM Relation Method
        // return (a*b)/lcm(a, b);
    }
    public static void main(String[] args) {
        int num1=15,num2=70;
        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2);
        int gcd_2Result = gcd_2(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd_2Result);
    }

}
