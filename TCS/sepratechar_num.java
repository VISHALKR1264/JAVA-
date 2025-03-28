public class sepratechar_num {
    //Constructor
    sepratechar_num(String str)
    {
        StringBuilder sc=new StringBuilder();
        StringBuilder sn=new StringBuilder();
        StringBuilder ss=new StringBuilder();
        for(char c: str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sn.append(c);
            }
            else if(Character.isLetter(c))
            {
                sc.append(c);
            }
            else
            {
                ss.append(c);
            }
        }
        System.out.println("Character  "+sc);
        System.out.println("Numbers  "+sn);
        System.out.println("Other Character  "+ss);
    }
    public static void main(String[] args) {
        String s = "2021021dsv@#$";
        new sepratechar_num(s);
        
    }
}
