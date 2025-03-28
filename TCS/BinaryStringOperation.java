// import java.util.Scanner;

// public class BinaryStringOperation {

//     public static int operationsBinaryString(String str) {
//         int n = str.length();
//         if (n == 0) {
//             return -1;
//         }

//         // Initial value (convert the first character to an integer)
//         int ans = str.charAt(0) - '0';  

//         for (int i = 1; i < n - 1; i += 2) {
//             char op = str.charAt(i);   // Operator ('A', 'B', or 'C')
//             int b = str.charAt(i + 1) - '0'; // Operand (convert char to int)

//             if (op == 'A') {
//                 ans &= b;  // AND operation
//             } else if (op == 'B') {
//                 ans |= b;  // OR operation
//             } else {
//                 ans ^= b;  // XOR operation
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         //1C0C1C1A0B1
//         String s = scanner.nextLine();
//         System.out.println(operationsBinaryString(s));
//         scanner.close();
//     }
// }

/**
 * BinaryStringOperation
 */
public class BinaryStringOperation {
    BinaryStringOperation(String str)
    {
        int n=str.length();
        if(n==0)
        {
            System.out.println(-1);
            return;
        }
        int ans=str.charAt(0)-'0';
        for(int i=1; i<n-1; i+= 2)
        {
            char op=str.charAt(i);
            int b=str.charAt(i+1)-'0';
            if(op == 'A')
            {
                ans &= b; 
            }
            else if(op == 'B')
            {
                ans |=b;
            }
            else{
                ans ^= b;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        new BinaryStringOperation(s);
    }
}