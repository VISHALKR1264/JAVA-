import java.util.Scanner;

public class password {
    public static int checkpassword(String str, int len, int min) {
        if (len < min) {
            return 0;
        }
        // starting char must not be a number
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        }
        int a = 0, captial_count = 0, numerical_count = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ' || ch == '+') {
                return 0;
            }
            //  if (Character.isUpperCase(ch))
            if (ch >= 'A' && ch <= 'Z') {
                captial_count++;
            }
            //if (Character.isDigit(ch))
            if (ch >= '0' && ch <= '9') {
                numerical_count++;
            }
            a++;
            
        }
        System.out.println("Capital letters count: " + captial_count);
        System.out.println("Numerical characters count: " + numerical_count);
        if (captial_count > 0 && numerical_count > 0)
                return 1;
            else
                return 0;
    }

    public static void main(String[] args) {
        int min_num_char = 4;
        String pass;
        Scanner sc = new Scanner(System.in);
        pass = sc.nextLine();
        int length = pass.length();
        System.out.println(checkpassword(pass, length, min_num_char));

    }
}
