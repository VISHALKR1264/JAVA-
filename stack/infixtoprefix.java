import java.util.Stack;

public class infixtoprefix {
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

    String reverse(String s) {
        String nstr = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }

    public String infixtoprefix(String s) {
        String rev = reverse(s);
        //After the reverse we have to again iterate for making (->) &)->(
            //if not do then change )->( in following code cointain
        Stack<Character> stack = new Stack<>();
        String res = "";
        for (int i = 0; i < rev.length(); i++) {
            char ch = rev.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                res += ch;// agr char mila mtlb usko print kro means ans me add;
            } else if (ch == ')') {
                stack.push(ch);// open bracet ko close bna dia kyuki reverse kye the
            } else if (ch == '(') {
                while (!stack.isEmpty() && stack.peek() != ')')// first check ki stack khali to nhi
                {
                    res += stack.peek();
                    stack.pop();
                }
                if (!stack.isEmpty())
                {
                    stack.pop();
                }
            } else// agr * , / , ^ aaye then a/q to precedense decide
            {
                while (!stack.isEmpty() && prec(stack.peek()) >= prec(ch))
                {
                    res += stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            res += stack.peek();
            stack.pop();
        }
        return reverse(res);

    }

    public static void main(String[] args) {
        infixtoprefix itp = new infixtoprefix();
        String result = itp.infixtoprefix("(a-b/c)*(a/k-l)");
        System.out.println("Converted prefix expression: " + result);
    }

}
