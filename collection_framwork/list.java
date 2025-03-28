import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        // All the methods of Collection are implemented in list;
        l.add(78);
        l.add(0, 10);// it store value in index form
        l.add(1, 50);
        l.add(2, 40);
        l.add(3, 40);// it can store duplicate element also;
        l.add(4, null);
        l.add(5, null);
        System.out.println("First list " + l);// it follow insertion order;
        // addAll method of collection add at end of the list
        // for specified position in the list
        List<Object> l2 = new ArrayList<>();
        l2.add(0, "vishal");
        l2.add(1, "aryan");
        l2.add(2, "rahul");
        l2.add(3, "mohan");
        l2.add(4, "kitu");
        l2.add(5, 100);
        System.out.println("Second List " + l2);
        boolean addAll = l.addAll(3, l2);
        System.out.println("AddAll a/q to index " + l);
        // to fetch a/q to index
        System.out.println(l2.get(1));// to get element from a specific index
        System.out.println("SubList " + l2.subList(2, 4));// TO fetch a subList
        // replace
        // replaceALL
        System.out.println("Replacing 1 element from List " + l2.set(5, "rohan"));// Replace the value at a specific
                                                                                  // index

        // quering
        System.out.println("Index value " + l2.indexOf("kitu"));// to find the index of any element start searching from
                                                                // begining
        System.out.println("LastIndex value " + l2.lastIndexOf("vishal"));// to find the index of any element start
                                                                          // searching from last

        // Iterator is a method of collection which is also used in list also
        // ListIterator is used here but not in set

        ListIterator lis = l2.listIterator(2);
        System.out.println("One by one fetching with specific index:-- ");
        while (lis.hasNext()) {
            System.out.println(lis.next());
        }
        System.out.println("Printing the element in reverse :--");
        while (lis.hasPrevious()) {
            System.out.println(lis.previous());
        }
    }
}
