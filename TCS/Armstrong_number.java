public class Armstrong_number {
    public static boolean function(int n)
    {
        int orginalnumber=n;
        int len=String.valueOf(n).length(); 
        int armstrong =0;
        while (n!=0) {
            int digit=n%10;
            armstrong += Math.pow(digit, len);
            n=n/10;
        }
        return armstrong==orginalnumber;
            

    }
    public static String armstrongNumber(int n) {
        // code here
        int sum=0;
        int org=n;
        int len=String.valueOf(n).length();
        while(n !=0)
        {
        int digit=n%10;
        sum +=Math.pow(digit,len);
        n=n/10;
        }
        return sum==org ? "true":"false";
    }
    public static void main(String[] args) {
        int n=153;
        System.out.println(function(n));
        System.out.println(armstrongNumber(n));


    }
}
