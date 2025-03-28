//Reverse Stack using one stack only
// import java.util.Stack;

// public class Reverse_Stack_Recursion {
//     Stack<Integer> stack = new Stack<>();

//     public int recursion() {
//         if (stack.isEmpty()) {
//             return 0;
//         } else {
//             int ele = stack.peek();
//             stack.pop();//-----5
//             recursion();//baki ho gya goga 
//             insertatbottom(ele);//-->5
//         }
//         return 1;

//     }

//     void insertatbottom(int ele) {
//         if (stack.empty()) {
//             stack.push(ele);
//         } else {
//             int element = stack.peek();
//             stack.pop();
//             insertatbottom(ele);
//             stack.push(element);
//         }
//     }

//     public static void main(String[] args) {
//         Reverse_Stack_Recursion rsr = new Reverse_Stack_Recursion();
//         rsr.stack.push(1);
//         rsr.stack.push(2);
//         rsr.stack.push(3);
//         rsr.stack.push(4);
//         System.out.println("Original stack: " + rsr.stack);
//         // Reversing the stack
//         rsr.recursion();

//         System.out.println("Reversed stack: " + rsr.stack);
//     }
// }

/**
 * Reverse_Stack_Recursion by making own stack;
 */
public class Reverse_Stack_Recursion {
    int stack[];
    int MAX_SIZE;
    int top;

    public Reverse_Stack_Recursion(int size) {
        this.MAX_SIZE = size;
        this.stack = new int[MAX_SIZE];
        this.top = -1;
    }

    public void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }

    public void pop() {
        int pop;
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            pop = stack[top--];
        }
    }

    public int recursion() {
        if (top == -1) {
            return 0;
        } else {
            int ele = stack[top];
            top--;
            recursion();
            insertatbottom(ele);
        }
        return 1;

    }

    void insertatbottom(int ele) {
        if (top == -1) {
            push(ele);
        } else {
            int element = stack[top];
            top--;
            insertatbottom(ele);
            push(element);
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; // or throw an exception
        } else {
            return stack[top];
        }
    }

    public static void main(String[] args) {
        Reverse_Stack_Recursion rsr = new Reverse_Stack_Recursion(4);
        rsr.push(1);
        rsr.push(2);
        rsr.push(3);
        rsr.push(4);

        System.out.println("Original stack:");
        while (rsr.peek() != -1) {
            System.out.println(rsr.peek());
            rsr.pop();
        }

        rsr.push(1);
        rsr.push(2);
        rsr.push(3);
        rsr.push(4);

        rsr.recursion();

        System.out.println("Reversed stack:");
        while (rsr.peek() != -1) {
            System.out.println(rsr.peek());
            rsr.pop();
        }
    }

}