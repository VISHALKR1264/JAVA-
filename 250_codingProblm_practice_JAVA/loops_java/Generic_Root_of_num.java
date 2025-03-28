
public class Generic_Root_of_num {
    public static void main(String[] args) {
        double number = 4; // The number you want the root of
        double root = 2;    // The root you want to find (e.g., cube root)

        double nthRoot = Math.pow(number, 1.0 / root); // Calculate the n-th root
        System.out.printf("The %.1f-th root of %.1f is: %.2f%n", root, number, nthRoot);
    }
}
