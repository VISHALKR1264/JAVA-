import java.util.Enumeration;
import java.util.Vector;

public class enumeration {
    public static void main(String[] args) {
        // Iterator is used by any Collection Method
        // use to read & remove

        // ListIterator is used by only List Implemented classes
        // use to read ,remove ,replace &add

        // Enumeration is used only by Legacy classes (1.0 V)
        // Use to read only

        Vector<Object> v = new Vector<>();
        v.add(20);
        v.add(30);
        v.add("vishal");
        v.add(206);
        System.out.println(v);
        // to reterive one by one in legecy classes
        Enumeration e = v.elements();
        System.out.println("One by One :--");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
