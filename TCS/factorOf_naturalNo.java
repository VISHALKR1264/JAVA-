import java.util.ArrayList;

public class factorOf_naturalNo {
    
    public static void printdivisor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                if (n / i == i)
                    System.out.print(i+" ");
                else {
                    System.out.print(i+" ");
                    arr.add(n / i);
                }
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--)
            System.out.printf("%d ", arr.get(i));
    }

    public static void main(String[] args) {

        int n = 100;
        printdivisor(n);
    }
}
