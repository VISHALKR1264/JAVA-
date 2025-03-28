
// ////---------------------------------->
// //Stack using linklist
// class LinkListStack {
//     node head;

//     class node {
//         int val;
//         node next;

//         node(int val) {
//             this.val = val;
//             this.next = null;
//         }
//     }

//     public void push(int val) {
//         node curr = new node(val);
//         if (head == null) {
//             System.out.println("LIST IS EMPTY so first node is oue head");
//             head = curr;
//         } else {
//             curr.next = head;
//             head = curr;
//         }

//     }

//     void display() {
//         node ptr = head;
//         for (ptr = head; ptr.next != null; ptr = ptr.next) {
//             System.out.println(ptr.val);
//         }
//         System.out.println(ptr.val);

//     }

//     public void pop() {
//         System.out.println("POPING:---");
//         // int top = head.val;
//         // System.out.println("TOP element :-- " + top);

//         if (head == null) {
//             System.out.println("Underflow");
//         } else {
//             head = head.next;
//             // System.out.println("After poping :-- " + head.val);
//         }
//     }

//     public void peak() {
//         if (head == null)

//         {
//             System.out.println("Empty List");
//         } else {
//             System.out.println("PEEK ELEMENT : " + head.val);
//         }
//     }

//     public static void main(String[] args) {
//         LinkListStack st = new LinkListStack();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.display();
//         st.peak();
//         st.pop();
//         st.display();
//         st.peak();

//     }
// }

/**
 * LinkListStack
 */
public class LinkListStack {
    node top;
    /**
     * node
     */
    public class node {
        int val;
        node next;
        public node(int val)
        {
            this.val=val;
            this.next=null;
            
        } 
    }
    public void push(int val)
    {
        node newnode = new node(val);
        if(top==null)
        {
            //System.out.println("Stack is Empty");
            top=newnode;
        }  
        else
        {
            newnode.next=top;
            top=newnode;
        }
    }
    public int pop()
    {
        if(top==null)
        {
            //System.out.println("Stack is empty underflow");
            return -1;
        }
        else
        {
            int popdata=top.val;
            top=top.next;
            return popdata;
        }
    }
    public int peek()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return top.val;
        }
    }
    public static void main(String[] args) {
        LinkListStack stack = new LinkListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peak element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Peak element is: " + stack.peek());

        
    }
}