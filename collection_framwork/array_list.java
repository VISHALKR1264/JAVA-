import java.util.ArrayList;
//All the method of collection and List is used here 

public class array_list {
    public static void main(String[] args) {
        // Creating an ArrayList
        // Constructs an empty list with an initial capacity of 10.
        // It can be resize dynamicaly
        //Default cap of ArrayList is 10
        //New cap=(Old cap*3)/2+1=16
        ArrayList<String> arr = new ArrayList<>();// here we can initilize the capacity

        // Adding elements to the ArrayList
        arr.add("vishal");
        arr.add("Aryan");

        ArrayList<String> arr1 = new ArrayList<>(arr);
        // Displaying the elements in the ArrayList
        System.out.println(arr1);
    }
}
