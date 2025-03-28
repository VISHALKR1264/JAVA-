public class isValid_Triangle {
    public static boolean valid(int a,int b,int c)
    {
        if((a+b>c) && (b+c>a) && (c+a>b))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a=8,b=8,c=8;
        if(valid(a,b,c))
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("IN_Valid Triangle");            
        }
    }
}
