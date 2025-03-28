import java.util.Scanner;

public class Ascii_value_of_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character ");
        
        char character=sc.next().charAt(0);
        int ascii=(int)character;
        System.out.println(ascii);
    }
}
 