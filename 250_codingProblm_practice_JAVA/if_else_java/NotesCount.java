
import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] noteCount = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i];
                amount %= notes[i];
            }
        }

        System.out.println("Notes required:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] != 0) {
                System.out.println(notes[i] + " : " + noteCount[i]);
            }
        }
    }
}

