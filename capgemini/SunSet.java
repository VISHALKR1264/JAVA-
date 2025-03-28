// you are given an array of height of building , you have to calculate how many building can see the SunSet
// ,A building can see the SunSet IF All the building toward left of it are less than its height

// ex-3,4,4,5,2,3---> O/p--> 3.

public class SunSet {
    public static void main(String[] args) {
        int arr[]=new int[]{3,4,4,5,2,3};
        int temp =-1,count =0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]> temp)
            {
                count++;
                temp=arr[i];
            }
        }
        System.out.println(count);
    }
}
