public class single_digit {
    public static void main(String[] args) {
        int num = 10;
        //Calculate how many Digit are there in the Digit;
        int digitCount = (int) Math.floor(Math.log10(num)) + 1;
        System.out.println("Number of digits: " + digitCount);


        while (num > 9) {
            if (num % 2 != 0) {
                num = num / 2;
            } else if (num % 2 == 0) {
                num = (num - 2) / 2;
            }
        }
        System.out.println(num);
    }
}
