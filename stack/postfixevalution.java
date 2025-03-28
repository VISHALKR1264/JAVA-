import java.util.Stack;

public class postfixevalution {
    Stack<Integer> stack = new Stack<>();// Stack is created

    public int prefixevalution(String s) {
        for (int i = 0; i < s.length(); i++)// Iterate from the first bcz postfix means first abc*^+ so LtoR
        {
            char ch=s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stack.push(ch - '0');
            } else {
                int op2 = stack.peek();//jo fist pop hoga wo operand 2 me jaye g
                stack.pop();
                int op1 = stack.peek();
                stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                    case '^':
                        stack.push((int) Math.pow(op1, op2));
                        break;

                    default:
                        break;
                }
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        postfixevalution pre = new postfixevalution();
        int result = pre.prefixevalution("46+2/5*7+");
        System.out.println("Evaluated result is "+result);

    }
}
