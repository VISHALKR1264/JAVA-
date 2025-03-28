//You are given an aray of size n we just had to select 2 element whole multiplication is max..
//We will select largest and second largest then multiply:

import java.util.Arrays;

public class sweetness_max {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,9,5,6,7,8,10};
        Arrays.sort(arr);

        System.out.println("Max Sweetness is :-  "+arr[arr.length-1]*arr[arr.length-2]);//--O(nLOGn)

        //--O(n)
        // use For loop only ,No need to sort as soting with Arrays.sort require O(nlog n) time complexity
        int newarr[]=new int[]{1,2,3,4,9,5,6,7,8,10};

        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<newarr.length;i++)
        {
            if(newarr[i] > largest)
            {
                second_largest=largest;
                largest=newarr[i];
            }
            else if(newarr[i] > second_largest)
            {
                second_largest=newarr[i];
            }
        }
        System.out.println("Maximum Sweetness with O(n) :-  "+ largest*second_largest);
    }
}
