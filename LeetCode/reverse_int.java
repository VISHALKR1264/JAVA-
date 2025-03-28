class reverse_int {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        // Test cases
        int[] numbers = { 123, -456, 120, Integer.MAX_VALUE, Integer.MIN_VALUE };

        reverse_int solution = new reverse_int();

        for (int num : numbers) {
            System.out.println("Original: " + num);
            int reversed = solution.reverse(num);
            System.out.println("Reversed: " + reversed);
            System.out.println();
        }
    }
}
