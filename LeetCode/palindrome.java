class palindrome {
    public boolean isPalindrome(int x) {
        // if(x<0)
        // {
        // return false;
        // }
        // int org=x;
        // int rev=0;
        // while(x!=0)
        // {
        // int digit=x%10;

        // rev=(rev*10)+digit;
        // x=x/10;

        // }
        // return org==rev;
        ///////////////////////////////
        // converted integer to string
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Characters mismatch
            }
            left++;
            right--;
        }
        return true; // All characters matched

    }

    public static void main(String[] args) {
        // Test cases
        int[] numbers = { 121, -55, 121, Integer.MAX_VALUE, Integer.MIN_VALUE };

        palindrome pd = new palindrome();

        for (int num : numbers) {
            System.out.println("Original: " + num);
            boolean palindrome = pd.isPalindrome(num);
            System.out.println("Palindrome: " + palindrome);
            System.out.println();
        }
    }
}