public class reverse_stack {
    int maxsize;
    int top;
    String stack[];

    reverse_stack(int size)
    {
        this.maxsize=size;
        this.stack = new String[maxsize];
        this.top=-1;
    }
    public void push(String value)
    {
        if(top==maxsize-1)
        {
            System.out.println("overflow");
        }
        else
        {
            stack[++top]=value;
        }
    }
    public String pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return null;
        }
        else
        {
            String pop=stack[top];
            top--;
            return pop;
        }
    }
    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null; // Return null when stack is empty
        }
        return stack[top];
    }
    public void reverse(String s) {
        for(int i=0;i<s.length();i++)
        {
            String word="";
            while (i<s.length() && s.charAt(i)!=' ') {
                word+=s.charAt(i);
                i++;
            }
            push(word);

        }
        while(top != -1)
        {
            
            System.out.print(peek()+" ");
            pop();
        }
        
    }

    public static void main(String[] args) {
        reverse_stack rv=new reverse_stack(10);
        String s="who is my bro tell me";
        rv.reverse(s);

    }
}
