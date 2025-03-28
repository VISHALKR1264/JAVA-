////--------------------------------------------->
//STACK USING ARRAY

// import java.util.Scanner;
// public class ArrayStack {
//     int size;
//     int top;
//     int[] stack;

//     ArrayStack() {
//         top = -1;
//         System.out.println("Enter the size of the stack");
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         stack = new int[size];
//     }

//     public int push(int data) {
//         if (top == size - 1) {

//             System.out.println("Stack is Full");
//             System.out.println("Overflow");

//         } 
//             top++;
//             return stack[top] = data;

//     }

//     public int pop() {
//         if (top==-1) {

//             System.out.println("Stack is Empty");
//             System.out.println("Underflow");
//         }

//         return stack[top--];

//     }

//     public int peek() {
//         return stack[top];
//     }

//     public static void main(String[] args) {
//         ArrayStack st = new ArrayStack();
//         System.out.println("Pushed Element  :-"+st.push(13));
//         System.out.println("Pushed Element  :-"+st.push(23));
//         System.out.println("Pushed Element  :-"+st.push(33));
//         System.out.println("Pushed Element  :-"+st.push(43));        
//         System.out.println("PEAK ELEMENT :- "+st.peek());
//         System.out.println("POPED ELEMENT"+st.pop());
//         System.out.println("PEAK ELEMENT :- "+st.peek());

//     }
// }

//------------------------------------->Stack using array
// class ArrayStack {
//     int size;
//     int top;
//     int stack[];

//     ArrayStack() {
//         int top = -1;
//         int size = 10;
//         stack = new int[size];
//     }

//     public void push(int val) {
//         if (top == size - 1) {
//             System.out.println("OVERFLOW");
//         } else {
//             top++;
//             stack[top] = val;
//         }
//     }

//     void display() {
//         System.out.println("DISPLAY::----");
//         for (int i = 1; i <= top; i++) {
//             System.out.println(stack[i]);
//         }
//     }

//     public int peek() {
//         System.out.println("Displaying top element");
//         return stack[top];
//     }

//     public void pop() {
//         System.out.println("One element is poped");
//         if (top == -1) {
//             System.out.println("Underflow");
//         } else {
//             int pop;
//             pop = stack[top--];
//         }
//     }

//     public static void main(String[] args) {
//         ArrayStack st = new ArrayStack();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.display();
//         System.out.println(st.peek());
//         st.pop();
//         st.display();

//     }
// }



//////////////
/**
 * ArrayStack
 */
public class ArrayStack {
    int MAX_SIZE;
    int stack[];
    int top;
    public ArrayStack(int size)
    {
        this.MAX_SIZE=size;
        this.stack=new int[MAX_SIZE];
        this.top=-1;
    }
    /**
     * InnerArrayStack
     */
    public class InnerArrayStack {
    
        public void push(int value)
        {
            if(top==MAX_SIZE-1)
            {
                System.out.println("Overflow");
            }
            else
            {
                top++;
                stack[top]=value;
            }
        }
        public void pop() {
            int pop;
            if (top == -1) {
                System.out.println("Underflow");
            } else {
                pop = stack[top--];
                System.out.println("poped element is "+pop);
            }
        }
    }
    public static void main(String[] args) {
        ArrayStack arr=new ArrayStack(3);
        ArrayStack.InnerArrayStack inr=arr.new InnerArrayStack();
        inr.push(10);
        inr.push(20);
        inr.push(30);
        inr.pop();
        inr.pop();
        inr.pop();
        inr.pop();

        
    }
}



// //////////////////////making it more secure
// /**
//  * ArrayStack
//  */
// public class ArrayStack {
//     private int MAX_SIZE;
//     private int stack[];
//     private int top;

//     public ArrayStack(int size) {
//         this.MAX_SIZE = size;
//         this.stack = new int[MAX_SIZE];
//         this.top = -1;
//     }

//     /**
//      * InnerArrayStack
//      */
//     private static class InnerArrayStack {

//         private void push(int value,ArrayStack outer) {
//             if (outer.top == outer.MAX_SIZE - 1) {
//                 System.out.println("Overflow");
//             } else {
//                 outer.top++;
//                 outer.stack[outer.top] = value;
//             }
//         }

//         private void pop(ArrayStack outer) {
//             int pop;
//             if (outer.top == -1) {
//                 System.out.println("Underflow");
//             } else {
//                 pop = outer.stack[outer.top--];
//                 System.out.println("Popped element is " + pop);
//             }
//         }
//     }

//     // Public methods to interact with the inner class
//     public void push(int value) {
//         InnerArrayStack inr = new InnerArrayStack();
//         inr.push(value,this);
//     }

//     public void pop() {
//         InnerArrayStack inr = new InnerArrayStack();
//         inr.pop(this);
//     }

//     public static void main(String[] args) {
//         ArrayStack arr = new ArrayStack(3);
//         arr.push(10);
//         arr.push(20);
//         arr.push(30);
//         arr.pop();
//         arr.pop();
//         arr.pop();
//         arr.pop(); // This will print "Underflow"
//     }
// }
