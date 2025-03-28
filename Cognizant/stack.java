public class stack {
    int[] stack;
    int top;
    stack()
    {
        top=-1;
        stack=new int[10];
    }

    public int add(int data) {
        if (top == stack.length - 1) {
            System.out.println("Overflow");
        }
        top++;
        return stack[top] = data;
    }

    public int pop() {
        if (top == -1) {

            System.out.println("Stack is Empty");
            System.out.println("Underflow");
        }

        return stack[top--];
    }
    public static void main(String[] args) {
        stack st=new stack();
        System.out.println(st.add(1));
        System.out.println(st.add(5));
        System.out.println(st.add(4));
        System.out.println(st.add(3));
    }
}
