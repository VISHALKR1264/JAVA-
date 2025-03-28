
//If ,the sum of ODD places Minus the Sum of Even Places == Zero or Multiple of 11 then the number is Divisible by 11.
//ex:-- 825==(13 - 2)=11 
public class Divisibility_by_VedicMath {
    public static void main(String[] args) {
        int num=825;
        String numStr = String.valueOf(num); // Convert the number to a string once
        int odd=0,even=0;
        for(int i=0;i<String.valueOf(num).length();i++)
        {
            // int digit =Character.getNumericValue(Character.getNumericValue(String.valueOf(num).charAt(i)));
            int digit = Character.getNumericValue(numStr.charAt(i)); // Get the digit

            if(i % 2 == 0)
            {
                odd += digit;
            }else 
            {
                even += digit;
            }
        }
        int diff=Math.abs(odd-even);

        if(diff % 11 == 0)
        {
            System.out.println(num + " is divisible by 11.");
        } else {
            System.out.println(num + " is NOT divisible by 11.");
        }
    }
}
