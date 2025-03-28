public class power_of_two {
    public boolean ispoweroftwo(int n)
    {
        if(n==0)
        {
            return false;
        }
        while (n != 1) {
            if(n % 2 !=0)
            {
                return false;
            }
            n=n/2;
        }
        return true;
    }
    public static void main(String[] args) {
        String binary="0100";
        int decimal= Integer.parseInt(binary,2);
        System.out.println("In Decimal :- "+decimal);
        System.out.println("In Binary  :- "+ Integer.toBinaryString(decimal));

        power_of_two s=new power_of_two();

        if (s.ispoweroftwo(decimal)) {
            System.out.println("Yes it is power of 2");
        }else         System.out.println("  Not in the power of 2 ");
    }


}
