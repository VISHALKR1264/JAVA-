
public class reverse_a_number {
    public static void main(String[] args) {
    int num=321;
    int rev=0;
    int i=0;
    int len=String.valueOf(num).length();
    while(i != len )
    {
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
        i++;
    }
    System.out.println(rev);
    }
}
