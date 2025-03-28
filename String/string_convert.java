import java.util.*;

public class string_convert {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s.length());

        StringBuffer sb = new StringBuffer("VISHAL");// This is muttable obj
        System.out.println(sb);
        // TO MAKE IT IMMUTABLE
        String s2 = new String(sb);
        System.out.println(s2);// It will print immutable object
        // Byte array to String
        byte[] b = { 101, 120, 121, 111 };
        String s3 = new String(b);
        System.out.println(b);
        System.out.println(s3);
        //Char array to String
        char[] c={'a','b','c'};
        String s4=new String(c);
        System.out.println(s4);//---->abc
        //Why char is more prefarable for password alter than string
        //As String as immutable and it doesn't have any garbage collector 
        char[] d=new char[]{'a','b','c'}; //char array
        System.out.println(d);//---->it will print like address;

        //-------------------------------------------------->CaseConversion
        String sr="Agnihotri";
        System.out.println(sr.toUpperCase());
        System.out.println(sr.toLowerCase());
        //-------------------------------------------------->Valueof
        //It convert differnt type of values into String By the help of String.Valueof
        //We convert int long float or double or any to String;
        int a=10;
        String s1=String.valueOf(a); //String.valueof-->Due to static method;
        System.out.println(s1);

        //--------------------------------------------------->TocharArray
        //Convert Given String to Sequence of character;
        char[] dd=sr.toCharArray();
        System.out.println(dd);



        
    }
}
