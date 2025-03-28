public class palindrome_string {
    public static void main(String[] args) {
        String strr="radar";
        strr=strr.toLowerCase();
        for(int i=0;i<strr.length()/2;i++)
        {
            if(strr.charAt(i) != strr.charAt(strr.length()-1-i))
            {
                System.out.println("Not a Palindrome");
                break;
            }
        }
        System.out.println("Palindrome");
    }
}
