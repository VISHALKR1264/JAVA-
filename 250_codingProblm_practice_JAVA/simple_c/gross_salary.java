import java.util.Scanner;

public class gross_salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary : ");
        int basic=sc.nextInt();
        System.out.println("Enter Allowance : ");
        int allowance=sc.nextInt();
        System.out.println("Enter Deduction : ");
        int deduction=sc.nextInt();

        System.out.println("Gross Salary "+(basic+allowance-deduction));
    }
}
