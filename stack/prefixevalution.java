import java.util.Stack;

public class prefixevalution {
    Stack<Integer> stack = new Stack<>();// Stack is created

    public int prefixevalution(String s) {
        for (int i = s.length()-1; i >= 0; i--)// Iterate from the last kuki first need operand then operator
        {
            char ch=s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stack.push(ch - '0');
            } else {
                int op1 = stack.peek();
                stack.pop();
                int op2 = stack.peek();
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
        prefixevalution pre = new prefixevalution();
        int result = pre.prefixevalution("-+7*45+20");
        System.out.println("Evaluated result is "+result);

    }
}
