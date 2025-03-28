//Limitation of Array
//In Java, you can create an array of objects by first defining a class for the objects and then creating an array of that class.
//class MyClass{
// public static void main(String[] args) {
//     // Create an array of MyClass objects
//     MyClass[] myArray = new MyClass[5];

//     // Initialize each element in the array
//     myArray[0] = new MyClass(1, "Object1");
//     myArray[1] = new MyClass(2, "Object2");
//     myArray[2] = new MyClass(3, "Object3");
// }
//In Java, an array is designed to hold elements of the same data type. This means that if you create an array of objects, all the objects in the array should be of the same class or subclass. Each element in the array is an instance of the specified class or a subclass of that class.
//However, you can achieve a level of flexibility by using the Object class or its wrapper classes, as they are the root of the class hierarchy in Java. If you create an array of Objects, you can store objects of different types in the same array

// Object[] mixedArray = new Object[5];

// // Store different types of objects in the array
// mixedArray[0] = "Hello, World!";        // String
// mixedArray[1] = 42;                      // Integer
// mixedArray[2] = 3.14;                    // Double
// mixedArray[3] = true;                    // Boolean
// mixedArray[4] = new MyClass(1, "Object"); // Custom object

// package collection_framwork;

// import javax.swing.text.StyledEditorKit;
import java.util.*;

public class collection {
    public static void main(String[] args) {
        // to add
        Collection<String> cl = new ArrayList<>();// we can't make obj of interface but wan can make reference of that;
        cl.add("vishal");
        cl.add("aryan");
        // System.out.println(cl);
        Collection<Object> allcl = new ArrayList<>(cl);// for heterogeneous element;
        allcl.add("raman");
        allcl.add(100);
        allcl.add(100.10);
        System.out.println(allcl);
        Collection<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        Collection<Integer> fnum = new ArrayList<>();
        fnum.add(10);
        fnum.add(20);
        fnum.add(30);
        fnum.add(40);
        System.out.println(num.addAll(fnum));// return true as all the element of fnum was added to num
        System.out.println("Add all the collection element to another of same data type " + num);

        // remove element
        System.out.println(cl.remove("vishal"));// single element can only be remove at a time
        System.out.println("Remove selected element " + cl);

        System.out.println(num.removeAll(fnum));// a whole collection can be remove
        System.out.println("Remove all fnum from num " + num);

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Grape");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Grape");
        list2.add("Kiwi");
        System.out.println(list1.retainAll(list2));// common between two collection that will be left only
        System.out.println("Left out either than common " + list1);

        list1.clear();
        System.out.println("Empty after clear " + list1);

        // Quering or checking available or not

        List<String> list3 = new ArrayList<>();
        list3.add("english");
        list3.add("hindi");
        list3.add("math");
        list3.add("bio");
        list3.add("history");
        boolean contains = list3.contains("hindi");
        System.out.println(contains);// return true bollean value and take input 1 i.e.Object;

        List<String> list4 = new ArrayList<>();
        list4.add("english");
        list4.add("hindi");
        list4.add("math");

        System.out.println(list3.containsAll(list4));// return true bollean value and take multiple input i.e.collection
                                                     // -c;

        System.out.println(list3.isEmpty());// rerturn boolean for empty or not

        System.out.println(list2.size());// return the int value size for the collection

        // Iteration

        Iterator itr = list3.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Equal
        System.out.println("for finding two collection have equal element and with same object :-");
        System.out.println(list3.equals(list4));

        // conversion to Array
        Collection<String> str1 = new ArrayList<>();
        str1.add("ant");
        str1.add("Ball");
        str1.add("cat");
        System.out.println(str1);

        Object[] array = str1.toArray();// convert to array form
        // toArray() method is called on an ArrayList<String>, and the returned array is
        // of type Object[]. The elements of the array are then printed using
        // Arrays.toString().
        System.out.println(Arrays.toString(array));// if directly want in string then overloaded has to use

        System.out.println("Converted in array directly in string form");
        String[] arr = str1.toArray(new String[0]);
        for (String element : arr) {
            System.out.println(element);
        }

    }

}
