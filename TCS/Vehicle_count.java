import java.util.Scanner;

public class Vehicle_count {
    public static void number_of_vehicle(int v, int w) {
        if (v <= 0 || w <= 0 || w % 2 != 0 || w < 2 || w > v * 4) {

            System.out.println("INVALID INPUT");
            return;
        }
        int tw = (w - v * 4) / (-2);
        int fw = v - tw;
        if (tw < 0 || fw < 0 || (tw + fw) != v) {
            System.out.println("INVALID INPUT");
            return;
        }
        System.out.println("TW = " + tw);
        System.out.println("FW = " + fw);

    }

    public static void main(String[] args) {
        int v, w;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        w = sc.nextInt();

        number_of_vehicle(v, w);
    }
}
