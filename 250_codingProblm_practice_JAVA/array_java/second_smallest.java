import java.util.Arrays;

public class second_smallest {
    public static void main(String[] args) {
        int[] arr = {10, -2, -1,-1,3, 7, -5, 8, 0, -1, 4, 6};

        Arrays.sort(arr);



        int uniquecount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i==0 || arr[i] != arr[i-1])
            {
                uniquecount++;
                if(uniquecount ==2)
                {
                    System.out.println("Second Smallest "+arr[i]);
                }

            }
        }



        //reducing Time complexity by this which even dont need Arrays.sort
        int newarr[]=new int[]{10, -2, -1,-1,3, 7, -5, 8, 0, -1, 4, 6};

        int smallest_fist=Integer.MAX_VALUE;
        int smallest_second=Integer.MAX_VALUE;
        for(int aray : newarr)
        {
            if(aray < smallest_fist)
            {
                smallest_second=smallest_fist;
                smallest_fist=aray;
            }else if(aray < smallest_second)
            {
                smallest_second=aray;
            }
        }
        System.out.println("smallest "+smallest_fist +" && Second smallest "+smallest_second);
    }
}
