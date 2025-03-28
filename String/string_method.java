import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class string_method {
    public static void main(String[] args) {
        //------------------------------------------------->Length Method
        String name="aryan";
        String email="          abc@gmail.com    ";
        String pass="abc123";
        // System.out.println(name.length());
        int i=name.length();
        if(i==0)
        {
            System.out.println("STRING IS EMPTY");

        }
        else
        {
            System.out.println(name.length());        
        }
        //------------------------------------------------->IsEmpty

        //System.out.println(email.isEmpty());//Return boolean value 

        if(email.isEmpty()==true)
        {
            System.out.println("String is Empty");

        }
        else
        {
            System.out.println(email.isEmpty()); 
        
        }

        //------------------------------------------------>Trim

        System.out.println(email);
        System.out.println(email.trim());//It will remove only starting and ending spaces
        if(email.trim().length()==0)
        {
        System.out.println("String is empty");
        }
        else
        {
        System.out.println("NOT empty and the trimed value is - "+email.trim());
        }

        //------------------------------------------------->Equals
        //It compare content of two string and return boolean value

        System.out.println(name.equals(email));
        String s4="VISHAL";
        String s5="vishal";
        String s6="";
        System.out.println(s4.equals(s5));//-->F
        //------------------------------------------------->IgnoreUpperCase
        System.out.println(s4.equalsIgnoreCase(s5));//-->T
        //------------------------------------------------->Check for Empty using equals
        System.out.println(s5.equals(""));//-->F
        System.out.println(s6.equals(""));//-->T    


        //------------------------------------------------->CompareTo  &&  CompareToIgnoreCase
        //Used to compare 2 string lexicographically by converting the srting into Unicode 
        //If both string are equal then value is 0 else return +ve or -ve;
        String s1="a";//97
        String s2="A";//65
        //97-65=32;   s1>s2-->+ve    s1<s2-->-ve
        System.out.println(s1.compareTo(s2));
        
        //--------------------------->Calculate Length using compareTo
        String l1="VISHAL";
        String l2="";
        System.out.println(l1.compareTo(l2));
        
        
        //--------------------------------------------------> + Operator
        System.out.println(name+email.trim());

        System.out.println(name+10);
        System.out.println(10+20+name);

        System.out.println(name+20/10);
        //System.out.println(name+10-5);-->ERROR bcz first catnetation take place


        //--------------------------------------------------->Concat
        //It concatinate one String to the end of another String
        System.out.println(name.concat(email.trim()));


        //---------------------------------------------------->Join
        //Static method which concatinate the given element with the delimiter and return the concatenated string
        System.out.println(String.join(",",name,email.trim()));

        //---------------------------------------------------->Subsequence
        //Return a charsequence 
        String seq="This is an index";
        System.out.println(seq.subSequence(3,9));// Return charsequence value
        System.out.println(seq.substring(3,9));//Return String type value
        System.out.println(seq);


        //----------------------------------------------------->To update String
        //REPLACE()  REPLACEFIRST()  REPLACEALL()
        //-->REPLACE
        seq=seq.replace("is", "was");//-->using reference due to immutable
        System.out.println(seq);//--->all places of is got changed

        //--.REPLACE FIRST
        String seqq="THIS IS DEMO";
        seqq=seqq.replaceFirst("IS","was"); //-->Only change the first 'is'
        System.out.println(seqq);

        //-->REPLACE ALL
        String seqqq="THIS IS DEMO";
        seqqq=seqqq.replaceAll("IS", "are");
        System.out.println(seqqq);

        //In replaceAll we can use Regrex(Regular Expression);
        String sq="This  is  my frnd";
        sq=sq.replaceAll("is(.)", "are");
        System.out.println(sq);
        //----->
        String sr="Hellow this is my dear frnd";
        sr=sr.replaceAll("is(.*)", "are");
        System.out.println(sr);//-->Hellow thare



        //--------------------------------------------------------->IndexOf
        //It return the position of first occurence of specified character in a string or return -1 if char not occur
        //Return Integer Value;
        String sp="AGNIHOTRI";
        int s=sp.indexOf("I");
        System.out.println(s);
        //-->
        int q=sp.indexOf("OT");
        System.out.println(q);
        //-->
        int r=sp.lastIndexOf("I");
        System.out.println(r);
    
        //--------------------------------------------------------->CharAt
        //Return character at a specific Index
        System.out.println(sp.charAt(8));

        //---------------------------------------------------------->Contains
        //Search the sequence of character in the given string ,if found return True Boolean Value;
        System.out.println(sp.contains("RI"));

        //---------------------------------------------------------->StartWith,Endwith;
        //It test that the string Start with the specific prefix or not if yes then return Boolean value;
        System.out.println(sp.startsWith("A"));//-->True
        System.out.println(sp.endsWith("S"));//-->False






    }




}
