import java.util.Stack;

public class balanced_parenthesis {
    public boolean isvalid(String s)
    {
        boolean ans=true;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}')
            {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }
                else
                {
                    ans=false;
                    break;
                }

            }
            else if(s.charAt(i)==')')
            {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else
                {
                    ans=false;
                    break;
                }

            }else if(s.charAt(i)==']')
            {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
                else
                {
                    ans=false;
                    break;
                }

            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        else
        {
            return ans;
        }

    }
    public static void main(String[] args) {
        balanced_parenthesis bl=new balanced_parenthesis();
        String str="{[()]}";
        if(bl.isvalid(str))
        {
            System.out.println("valid string");
        }
        else
        {
            System.out.println("Invalid string");
        }

    }
}
