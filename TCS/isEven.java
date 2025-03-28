//Floating point number even or odd
// Given a floating point number in string format s, check whether it is even or odd.
 

// Example 1:

// Input: 
// n = 4
// s = 97.8
// Output: EVEN
// Explanation: 8 is even number.



// Example 2:

// Input:
// n = 6
// s = 100.70
// Output: ODD
// Explanation: Trailing 0s after dot do not matter.




public class isEven {
    public static boolean iseven(String s,int n) 
    { 
       int i=n-1;
       
        while(s.charAt(i)!='.') {
            if(s.charAt(i)!='0'){
                if((s.charAt(i)-'0')%2==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            i--;
        }
        if((s.charAt(i-1)-'0')%2==0){
            System.out.println(s.charAt(i-1)-'0');
            return true;
        }
        return false;
    }
    public static boolean isevenn(String s,int n) 
    { 
      
        int decimalIndex = s.indexOf('.');
        
        String lastDigit;
        
        if (decimalIndex != -1) {
            // Split the string into integer and fractional parts
            String integerPart = s.substring(0, decimalIndex);
            String fractionalPart = s.substring(decimalIndex + 1);
            
            // Remove trailing zeros from the fractional part
            fractionalPart = fractionalPart.replaceAll("0+$", "");
            
            // Determine the last relevant digit
            if (!fractionalPart.isEmpty()) {
                lastDigit = Character.toString(fractionalPart.charAt(fractionalPart.length()-1));
                System.out.println(lastDigit);
            } else {
                lastDigit = Character.toString(integerPart.charAt(integerPart.length() - 1));
                System.out.println(lastDigit);

            }
        } else {
            // No decimal point, simply take the last digit of the integer part
            lastDigit = Character.toString(s.charAt(s.length() - 1));
            System.out.println(lastDigit);

        }
        
        // Check if the last digit is even
        return "02468".contains(lastDigit);
    
    }

    public static void main(String[] args) {
        String s ="100.88";
        int n=6;
        System.out.println(iseven(s,n));
        System.out.println(isevenn(s,n));
    }
}
