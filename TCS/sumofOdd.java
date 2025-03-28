import java.util.Scanner;

public class sumofOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array And then the array Element ");
        int Length = sc.nextInt();
        int arr[] = new int[Length];
        int i = 1;
        int sum = 0;
        for (int num : arr) {
            System.out.print("Enter the " + i + " number ");
            num = sc.nextInt();
            if(num % 2 != 0)
            {
            sum+=num;
            }
            i++;
            
        }
        System.out.println("The Sum of ODD number is " + num);
    }
}
