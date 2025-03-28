public class factorial {

    public static int function(int n)
    {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

       return (n*function(n-1));
    }
    public static void main(String[] args) {
        
        System.out.println(function(4));
        
    }
}
