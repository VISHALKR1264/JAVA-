public class leap_year {
    public static void main(String[] args) {
        int year=2008;
        System.out.printf(((year % 4==0 && year %100 !=0 )||(year %400 ==0))? "It is LEAP year" : "It is Not LEAP year");
    }
}
