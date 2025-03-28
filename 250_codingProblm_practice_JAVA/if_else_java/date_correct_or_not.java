public class date_correct_or_not {
    public static void main(String[] args) {
        int day=31;
        int month= 11;
        int year=2003;

        if(day <1 && day > 31 || month <1 || month > 12 || year <1)
        {
            System.out.printf("Not a correct DATE");
        }
        else
        {
            if(month ==2)
            {
                boolean leap = (year %4==0 && year %100 !=0)||(year %400 ==0);
                if (day > (leap ? 28:29)) {
                    System.out.printf("Not acorrect DATE");
                    return;
                }
            }
            else if ( month == 4 || month == 6||month == 9||month == 11)
            {
                if(day >30)
                {

                    System.out.printf("Not a correct DATE");
                    return;
                }
            }
            System.out.printf("correct DATE");
           
        }
    }
}
