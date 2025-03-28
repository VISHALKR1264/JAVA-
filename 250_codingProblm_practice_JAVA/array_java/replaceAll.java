public class replaceAll {
    public static void main(String[] args) {
        String str="vishal"; 
        String newstr=str.replaceAll(".", "*");
        System.out.println(newstr);


        StringBuilder sc=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            sc.append("*");
        }
        String replacedStr = sc.toString();
        System.out.println(replacedStr);


        
        String arr[]=new String[]{"vishal","rahul","mukesh"};
        for(String s: arr)
        {
            String astrik= "*".repeat(s.length());
            System.out.println(astrik);
        }
    }
}