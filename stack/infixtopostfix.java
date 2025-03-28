import java.util.Stack;

public class infixtopostfix {
    int prec(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    String infixtopostfix(String s) {
        Stack<Character> stack = new Stack<>();
        String res = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                res += ch;//agr char mila mtlb usko print kro means ans me add;
            } else if (ch == '(') {
                stack.push(ch);//open bracet to push in stack 
            } else if (ch == ')') {
                //close means stack s tb tk pop kro ,or us poped element ko add kro ans me jb tk ) naa mile
                while (!stack.isEmpty() && stack.peek() != '(')//first check ki stack khali to nhi 
                {
                    res += stack.peek();
                    stack.pop();
                }
                if (!stack.isEmpty())//agr )  aaye or stack khali h to just pop it no need to add it in the ans 
                {
                    stack.pop();
                }
            } else//agr * , / , ^ aaye then a/q to precedense decide  
            {
                while (!stack.isEmpty() && prec(stack.peek()) >= prec(ch))//check for empty agr not then check top k prec >= jo aaya us operator k prec
                {
                    res += stack.peek();//high h to pop the lower_one and add in the ans
                    stack.pop();
                }
                stack.push(ch);//high wala ko push in stack
            }
        }
        while (!stack.isEmpty()) {
            res += stack.peek();
            stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        infixtopostfix itop = new infixtopostfix();
        String result = itop.infixtopostfix("a+b*(c^d-e)^(f+g*h)-i");
        System.out.println("Converted postfix expression: " + result);
    }
}
