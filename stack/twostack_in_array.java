public class twostack_in_array {
    int maxsize;
    int top1;
    int top2;
    int arr[];
    public twostack_in_array(int size)
    {
        this.maxsize=size;
        this.arr=new int[maxsize];
        this.top1=-1;//age se insert
        this.top2=maxsize;//piche se insert
    }
    public void push1(int value)
    {
        if(top1<top2-1)
        {
            arr[++top1]=value;
        }
        else
        {
            System.out.println("Overflow stack 1");
        }
    }
    public void push2(int value)
    {
        if(top1<top2-1)
        {
            arr[--top2]=value;
        }
        else
        {
            System.out.println("Overflow stack 2");
        }
    }
    public int pop1()
    {
        if (top1 == -1) 
        {
            return -1;
        }
        else
        {
            return arr[top1--];
        }
    }
    
    public int pop2()
    {
        if (top2 == -1) 
        {
            return -1;
        }
        else
        {
            return arr[top2++];
        }
    }
    public static void main(String[] args) 
    {
        twostack_in_array stack=new twostack_in_array(5);
        stack.push1(1);   
        stack.push2(2);   
        stack.push1(3);   
        stack.push2(4);   
        stack.push1(5);   
        stack.push2(6);   
        System.out.println(stack.pop1()); 
        System.out.println(stack.pop2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
    }
}
