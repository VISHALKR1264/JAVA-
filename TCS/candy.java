import java.util.Arrays;

public class candy {
  public static void main(String[] args) {
    int arr[]=new int[]{5,12,10,3};
    int M=6;
    int ans=0;
    Arrays.sort(arr);
    for(int num : arr)
    {
        System.out.print(num +" ");
    }
    System.out.println();
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i] % 5 == 0)
        {
            ans++;
        }
        else if(M >= arr[i])
        {
            ans++;
            M=M-arr[i];
        }
    }
    System.out.println(ans);
  }
}
