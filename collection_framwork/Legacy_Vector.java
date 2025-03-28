import java.util.Vector;

public class Legacy_Vector {
    public static void main(String[] args) {
        //It is Introduce in 1.0V when the collection framwork is not there
        //Then a/q to framwork it is modified to adjust in new collection Hierarchy which called as Legacy Class
        //VECTOR & STACK are legacy classes
        //It is also growable and resizabe as ArrrayList only extra is Synchronised
        //Data Consistency is Gurantee
        //Default cap of Vector is 10
        //New cap=(Old cap*2)=20

        //It contain all the List and Collection Interface method
        Vector <String> vec=new Vector<>();
        vec.addElement("vishal");
        vec.addElement("aryan");
        vec.add("ramu");        
        System.out.println(vec);
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        System.out.println("capacity "+vec.capacity());
        
        //remove elements 
        
        vec.setElementAt("mohan",2);
        vec.removeElementAt(2);
        System.out.println("Remove element at its index pos:-- "+vec);
        vec.removeElement("ramu");
        System.out.println("Removing element with obj name:-- "+vec);
        vec.removeAllElements();
        System.out.println("All Elements are removed :--"+vec);

    }
}
