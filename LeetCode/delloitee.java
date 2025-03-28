import java.util.Scanner;


public class delloitee {
    // Take two user i/p and check if they are number then add them if string then
    // concatinate


    public static boolean isInt(String str)
    {
        if(str.length()==0 || str.isEmpty() || str == null)
        {
            return false;
        }
        for(int i=0;i<str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two digits");
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();
        // try {
        // int num1 = Integer.parseInt(inp1);
        // int num2 = Integer.parseInt(inp2);
        // int sum = num1 + num2;
        //     System.out.println("The sum of 2 numberis " + sum);
        // } catch (Exception e) {
        // String result=inp1+inp2;
        // System.out.println(result);
        // }



        //Using If else
        if(isInt(inp1)&& isInt(inp2))
        {
            int num1 = Integer.parseInt(inp1);
            int num2 = Integer.parseInt(inp2);
            int sum = num1 + num2;
            System.out.println("The sum of 2 numberis " + sum);
        }
        else{
            String result=inp1+inp2;
            System.out.println(result);
        }
    }
}
