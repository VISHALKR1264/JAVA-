//A cake is cut into 'n' peices then what the maximum number of peices i can obtain
//n=0 cut then peices of cake is 1 (the whole cake)
//n=1-->1+1cake
//n=1,2,3,...n--->n(n+1)/2 +1;

import java.util.Scanner;

public class edward_birthday_cake {
    public static void main(String[] args) {
        final int MOD = 100000007;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of peices that u want to cut the cake ");
        int n=sc.nextInt();
        int peices=1;
        if(n>0)
        {
            peices=(n*(n+1)/2 +1) % MOD;
            System.out.println("No of Peices is  "+peices);
        }
        else{
            System.out.println("No of Peices is  "+peices);
            return;
        }
    }
}
