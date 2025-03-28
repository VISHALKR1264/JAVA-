//Union of 2 array using hashset and Intersection
import java.util.HashSet;
public class hashmap_Q2 {
    @SuppressWarnings("unchecked") //-->For removing error msg
    public static HashSet<Integer> union_array(int arr1[],int arr2[])
    {
        HashSet<Integer> hs=new HashSet();
        for(int i=0;i<arr1.length;i++)
        {
            hs.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++)
        {
            hs.add(arr2[j]);
        }
        
        System.out.println("Size of array after combining "+hs.size());
        return hs;

    }
     public static int Intersection(int arr1[],int arr2[])
    {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int n=arr1.length;
        for(int i=0;i<n;i++)
        {
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++)
        {
            if(set.contains(arr2[j]))//Match
            {
                count++;
                System.out.println("Common Elements are "+arr2[j]);
                set.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
   int arr1[]={7,3,9};
    int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> elements=union_array(arr1,arr2);
        System.out.println("Elements of array after combining "+elements);
        int I_size=Intersection(arr1,arr2);
        System.out.println("Size of the array after Intersection "+I_size);
    }
}
