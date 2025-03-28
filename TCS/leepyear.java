public class leepyear {
    public static void main(String[] args) {
        int N=4;
        //code here
        if((N % 100 !=0 && N % 4 ==0)||(N % 400 == 0 ))
        {
            System.out.println("leepyear");
        }
        else
        System.out.println("Not");        
    }
}
