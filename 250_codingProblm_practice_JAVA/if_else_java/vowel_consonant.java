import java.util.Scanner;


public class vowel_consonant {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");

        char ch = scanner.next().charAt(0);
        String result = checkString(ch);
        System.out.println("The character '" + ch + "' is a " + result + ".");
        
    }

    public static String checkString(char ch)
    {
        if(Character.isLetter(ch))
        {
            if("AEIOUaeiou".indexOf(ch) != -1)
            {
                return "Vowel";
            }
            else{
                return "consonent";
            }
        }
        else
        {
            return "not a letter";
        }
    }
}
