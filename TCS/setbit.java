public class setbit {
    public static void main(String[] args) {
        int n = 10;
        // Binary conversion of n;
        String binary_num = Integer.toBinaryString(n);
        System.out.println("Binary Representation of this number " + binary_num);
        // FOR COUNTING SET BIT;
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>= 1; // right shift by 1 pos;
        }
        System.out.println("Set BIT is " + count);
        int ans = (1 << count) - 1;// int ans = (int) (Math.pow(2, count) - 1);--->According to GP series to evaluate 1,2,4,8,16...
        // Sn=a(r^n-1)/r-1; ====>Sn=2^n-1;
        System.out.println("Lowest value with the set bit is " + ans);
    }

}
