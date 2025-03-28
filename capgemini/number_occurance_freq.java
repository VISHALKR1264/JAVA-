import java.util.HashMap;
import java.util.Scanner;

public class number_occurance_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Input");
        int len = sc.nextInt();
        int digit;
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the Digits");
        for (int i = 0; i < len; i++) {
            digit = sc.nextInt();
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        for (var num : map.entrySet()) {
            System.out.println(num.getKey() + " Occurs " + num.getValue()+" Times.");
        }
    }
}
