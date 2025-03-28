public class powerOf_Two {
    public boolean isPowerOfTwo(int n)
    {
        if(n <= 0)
        {
            return false;
        }
        while(n > 1)
        {
            if(n % 2 != 0)
            {
                return false;
            }
            n=n/2;
        }
        return true;



        // return (n > 0) && ((n &(n-1)) == 0);
    }


    public boolean isPowerOfThree(int n)
    {
        if(n <= 0)
        {
            return false;
        }

        while (n % 3==0) {
            n=n/3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int n=9;
        powerOf_Two p=new powerOf_Two();
        boolean result=p.isPowerOfTwo(n);
        System.out.println("Power of Two : "+result);
        System.out.println("Power of Three : "+p.isPowerOfThree(n));
    }
}
