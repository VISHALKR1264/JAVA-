
public class greatest_no_among_3 {
    public static void main(String[] args) {
        int a=2,b=1,c=9;
        int greatest;
        if(a>=b && a>=c)
        {
            greatest=a;
        }
        else if(b>=a && b>=c)
        {
            greatest=b;
        }
        else
        {
            greatest=c;
        }
        System.out.println(greatest );
    }
}
