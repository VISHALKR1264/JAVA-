public class read_print_by_recursion {
    public static void recursion(String str[],int index)
    {
        if(index == str.length)
        {
            return;
        }
        System.out.println(str[index]);
        recursion(str, index+1);
    }
    public static void main(String[] args) {
        String arr[] = new String[] { "vishal", "rahul", "mukesh" };
        recursion(arr,0);
    }
}
