import java.util.Arrays;

public class second_largest {
    public static void main(String[] args) {
          int[] arr = {10,10,10, -2, -1,-1,3, 7, -5, 8, 0, -1, 4, 6};

        Arrays.sort(arr);

        int uniquecount=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==arr.length-1 || arr[i]!=arr[i+1])
            {
                uniquecount++;
                if(uniquecount==2)
                {
                    System.out.println(arr[i]);
                }
            }
        }



        //reducing Time complexity by this which even dont need Arrays.sort
        int newarr[]=new int[]{1,2,34,5,6,78};

        int largest_fist=-1;
        int largest_second=-1;
        for(int aray : newarr)
        {
            if(aray > largest_fist)
            {
                largest_second=largest_fist;
                largest_fist=aray;
            }else if(aray>largest_second)
            {
                largest_second=aray;
            }
        }
        System.out.println("Largest "+largest_fist +" && Second Largest "+largest_second);
    }
}
