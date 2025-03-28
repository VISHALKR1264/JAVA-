public class divisiblecheck {
    public static boolean isdivisiblea(String str)
    {
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            // sum += (str.charAt(i)-'0');
            //Char to string then to integer;
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        return (sum % 9 == 0);
    }
    public static void main(String[] args) {
        String s="99333";
        System.out.println(isdivisiblea(s));

    }
}
