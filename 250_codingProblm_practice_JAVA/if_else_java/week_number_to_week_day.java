public class week_number_to_week_day {
    public static void main(String[] args) {
        int weekno=7;
        switch (weekno) {
            case 1:
                System.out.println("SUNDAY");
                break;
                case 2:
                System.out.println("MONDAY");
                break;
                case 3:
                System.out.println("TUESDAY");
                break;
                case 4:
                System.out.println("WEDNESDAY");
                break;
                case 5:
                System.out.println("THRUSDAY");
                break;
                case 6:
                System.out.println("FRIDAY");
                break;
                case 7:
                System.out.println("SATURDAY");
                break;
            
                
        
            default:
            
                System.out.println("Enter valid !! week day number ");
                break;
        }
    }
}
