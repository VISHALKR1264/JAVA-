// Problem Statement –

// You have write a function that accepts, a string which length is "len", the string has some "#", in it you have to move all the hashes to the front of the string and return the whole string back and print it

// char* moveHash(char str[],int n);

// example :-

// Sample Test Case

// Input:

// Move#Hash#to#Front

// Output:

// ###MoveHashtoFront


import java.util.Arrays;

public class moveHash {
    public static void moveHashfront_using_2_String_obj(String str,int len)
    {
        String str1="";
        String str2="";
        for(int i=0;i<len;i++)
        {
            if (str.charAt(i) == '#') {
                str1 +=str.charAt(i);
            }
            else
            {
                str2 +=str.charAt(i);
            }
        }
        System.out.println(str1.concat(str2));

    }
    public static void moveHashfront(String str,int len)
    {
        int count=0;
        String new_str[]=str.split("#");
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='#')
            {
                count++;
            }
            
        }
        String result ="#".repeat(count)+String.join("", new_str);
        System.out.println(result);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<count;i++)
        {
            sb.append("#");
        }
        for(String s : new_str)
        {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str="Move#Hash#to#Front";
        int n=str.length();
        //Done by first counting the #, and then split that String , then append # in front::
        moveHashfront(str,n);

        //First make two Empty String object now check str==# then add in one String obj and str!=# store in other ,at last concat them ::
        moveHashfront_using_2_String_obj(str,n);
    }
}
