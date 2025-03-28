import java.util.Scanner;

public class alphabet_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");

        char ch = scanner.next().charAt(0);
        
        if(ischar(ch))
        {
            System.out.println("The character '" + ch + "' is an alphabet.");
        } else {
            System.out.println("The character '" + ch + "' is not an alphabet.");
        }
        
    }
    public static boolean ischar(char ch)
    {
        return Character.isLetter(ch);
    }
}
