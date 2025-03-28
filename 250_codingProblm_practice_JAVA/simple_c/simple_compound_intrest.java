import java.util.Scanner;

public class simple_compound_intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle : ");
        int principle=sc.nextInt();
        System.out.println("Enter Rate : ");
        int rate=sc.nextInt();
        System.out.println("Enter Time : ");
        int time=sc.nextInt();

        double SI=(principle * rate *time) / 100;
        System.out.println(SI);
        double amount= principle *Math.pow(1 + (rate / 100), time);
        double CI=amount - principle;
        System.out.println("CI "+ CI);

    }
}
