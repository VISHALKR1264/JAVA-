public class divider_index_find {

    public static int findDividendIndex(int[] arr, int divisor, int quotient, int remainder) {
        // Calculate the dividend using the given formula
        int dividend = divisor * quotient + remainder;
        
        // Iterate through the array to find the dividend
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dividend) {
                return i;  // Return the index if dividend is found
            }
        }
        
        return -1;  // Return -1 if dividend is not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 23, 30, 45};
        int divisor = 3;
        int quotient = 4;
        int remainder = 1;

        int index = findDividendIndex(arr, divisor, quotient, remainder);
        System.out.println(index);  // Output: 1 (because 3*4+1 = 13, which is at index 1)
    }
}




// public class divider_index_find {

//     public static int findDividendIndexInString(String str, int divisor, int quotient, int remainder) {
//         // Calculate the dividend using the given formula
//         int dividend = divisor * quotient + remainder;

//         // Convert dividend to string
//         String dividendStr = Integer.toString(dividend);

//         // Find the position of the dividend in the string
//         int index = str.indexOf(dividendStr);

//         // If not found, return -1; otherwise, return the index
//         if (index == -1) {
//             return -1;
//         }

//         // To find the index in terms of position in the original array,
//         // you would need to split the string and find the index of the exact number
//         String[] numbers = str.split(" ");
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i].equals(dividendStr)) {
//                 return i; // Return the index of the dividend in the split array
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         String numbers = "5 12 23 30 45";
//         int divisor = 3;
//         int quotient = 4;
//         int remainder = 1;

//         int index = findDividendIndexInString(numbers, divisor, quotient, remainder);
//         System.out.println(index); // Output will depend on the calculated dividend and its position
//     }
// }
