import java.util.Stack;

/**
 * Legacy_Stack
 */
public class Legacy_Stack {
    public static void main(String[] args) {
        //It is also Index based and Implemented on the basis of ArrayList,LinkList and Vector
        Stack<Object> st =new Stack<>();
        st.push("vishal");
        st.push("Rajveer");
        st.push("Himanshi");
        st.push(90);
        System.out.println(st);
        System.out.println("Peek of the element "+st.peek());
        System.out.println("Top most element is poped "+st.pop());
        System.out.println("Second top most element is poped "+st.pop());
        System.out.println(st);
        System.out.println("Available at index "+st.search("vishal"));
        System.out.println("Available at index "+st.search("sonal"));
        System.out.println("Stack is Empty "+st.empty());
    }

}