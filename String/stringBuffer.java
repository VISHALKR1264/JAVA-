public class stringBuffer {
    //StringBuffer are Muttable;
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Vishal");
        sb.append(" Kumar");
        System.out.println(sb);//1 obj created only
    } 
    //If data is not changing or changing 1 or 2 time then use String;
    //else use StringBuffer
    //It is Synchronised
    //StringBuilder have same function and same constructor & method but non-synchronised;
    
}
