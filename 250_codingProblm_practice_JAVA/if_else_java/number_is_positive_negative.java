
public class number_is_positive_negative {
    public static boolean check_for_pos_neg(int num)
    {
        if(num > 0)
        {
            return true;
        } 
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int num=1;
        System.out.println(check_for_pos_neg(num));
    }
}
