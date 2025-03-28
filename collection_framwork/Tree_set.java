import java.util.TreeSet;

public class Tree_set {
    //Directly implemented by class of Nevigatabele set and Inderectly by Sorted Set and Set Interface
    //TreeSet Underline Data_structure is Balanced Tree
    //Not an Indexbased DataStructure not follow Insertion order
    //Follow Sorting Order
    //Store Homogeneous data type
    //Not store Duplicate element
    //Non-Synchronized DS
    

    public static void main(String[] args) {
     TreeSet <String> treeSet = new TreeSet<>();
     //Print in Sorted order 
     treeSet.add("Apple");    
     treeSet.add("Mango");    
     treeSet.add("Banana");    
     treeSet.add("Lemon");
     System.out.println(treeSet);    
 
     TreeSet <Integer> treet = new TreeSet<>();
     //Print in Sorted Decending order 
     treet.add(10);    
     treet.add(30);    
     treet.add(43);    
     treet.add(22);
     System.out.println(treet.descendingSet());    
     //We can use Iterator over the element
     System.out.println(treet.first());    
     System.out.println(treet.last());         
    }
}
