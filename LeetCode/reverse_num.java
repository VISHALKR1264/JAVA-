public class reverse_num {
    public static void main(String[] args) {
        int a=3,b=7;
        ////--->
        //Using third variable
        // int temp=0;
        // temp=a;
        // a=b;
        // b=temp;
        ////---->
        //Using add and sub
        // a=a-b;
        // b=a+b;
        // a=b-a;
        ////------>
        //Using XoR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("value of 'a' from 3 become "+ a +" and value of 'b' form 7 become "+b);
    }
}
