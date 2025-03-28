import java.util.LinkedList;

public class link_list {
    public static void main(String[] args) {
        //All method of collection and List is applicable here  
        //extra methods
        LinkedList<Integer> li=new LinkedList<>();
        li.addFirst(10);//Hetrogeneous data type
        li.addFirst(11);
        li.addFirst(12);
        li.addLast(13);
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        li.removeFirst();
        System.out.println(li);
        li.removeLast();
        System.out.println(li);
    }
}

