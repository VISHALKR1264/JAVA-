import java.util.Scanner;

public class percentage_of_5_sub {
    public static void main(String[] args) {
        final int Max_Marks=100;
        final int No_of_SUB=5;
        int total_marks=No_of_SUB * Max_Marks;
        int obtain_marks=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i <= No_of_SUB;i++)
        {
            System.out.println("Enter marks for sub "+ i);
            int marks=sc.nextInt();
            obtain_marks+=marks;   
        }
        double percentage=(double)obtain_marks / total_marks*100;
        System.out.println("Percentage of 5 Sub ="+ percentage);
    }
}
