// //Reverse a String -------->
// class strig {
// //reverse an string
// void methos(){
// StringBuffer sb=new StringBuffer("VISHAL");
// sb=sb.reverse();
// System.out.println(sb.toString());

// }
// }
// class string_question
// {
// public static void main(String[] args) {
// strig s=new strig();
// s.methos();
// }
// }

// Reverse a String---------->
// class strig {
// //reverse an string
// public static String methos(String str){
// StringBuffer sb=new StringBuffer(str);
// sb=sb.reverse();
// System.out.println(sb.toString());
// return sb.toString();

// }
// }
// class string_question
// {
// public static void main(String[] args) {
// System.out.println(strig.methos("My name is raj"));
// }
// }

// Reverse-------------------->
// class string_question
// {
// public static void main(String[] args) {
// String s="My name is raj";
// char[] ch=s.toCharArray(); //Converted String to character Array
// String rev="";
// for(int i=ch.length-1;i>=0;i--)
// {
// rev=rev+ch[i];
// }
// System.out.println(rev);
// }
// }

// Reverse-------------------->
// class string_question
// {
// public static void main(String[] args) {
// String s="My name is raj";
// String rev="";
// for(int i=s.length()-1;i>=0;i--)
// {
// rev=rev+s.charAt(i);
// }
// System.out.println(rev);
// }
// }

// ---------------------------------------------------------------------------------------------------------->
// counting Frequency---------------->
// class string_question {
// public static void main(String[] args) {
// int count = 0;
// String s = "I just wanna die harder means much harder";
// for (int i = 0; i <= s.length() - 1; i++) {
// if (s.charAt(i) == 'a') {
// count++;
// }

// }
// System.out.println(count);
// }
// }

// counting Frequency---------------->
// class string_question {
// public static String method(String s) {
// int count = 0;
// for (int i = 0; i <= s.length() - 1; i++) {
// if (s.charAt(i) == 'a') {
// count++;
// }

// }
// System.out.println(count);
// String s1=String.valueOf(count); //Converted Int to String;
// return s1;
// }

// public static void main(String[] args) {
// System.out.println(string_question.method("There is too mamy things"));

// }
// }

// -------------------------------------------------------------------------------------------------------->

// Print character at odd place of string----------->
// class string_question
// {
// public static void main(String[] args) {
// String s="Welcome my baby";
// for(int i=0;i<s.length()-1;i++)
// {
// if(i%2!=0)
// {
// System.out.println("Character at "+i+" is "+s.charAt(i));
// }
// }
// }
// }

// --------------------------------------------------------------------------------------------------------->
// Palindrome

// class string_question {
// public static void main(String[] args) {

// String s = "nitin";
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// rev = rev + s.charAt(i);
// }
// System.out.println(rev);
// if(s.equals(rev))
// {
// System.out.println("YES IT IS PALINDROME");
// }
// else
// {
// System.out.println("YES IT IS PALINDROME");

// }

// }
// }

// Palindrome----------->

// class string_question {
// void method(String s) {
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// rev = rev + s.charAt(i);
// }
// System.out.println(rev);
// if (s.equals(rev)) {
// System.out.println("YES IT IS PALINDROME");
// } else {
// System.out.println("YES IT IS PALINDROME");

// }
// }

// public static void main(String[] args) {
// string_question sq=new string_question();
// sq.method("nitin");
// }
// }

// Palindrome------------>
// class string_q {
// public static String method(String s) {
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// rev = rev + s.charAt(i);
// }
// System.out.println(rev);
// if (s.equals(rev)) {
// System.out.println("YES IT IS PALINDROME");
// } else {
// System.out.println("NO IT IS PALINDROME");

// }
// String s1 = String.valueOf(rev);
// return s1;
// }
// }

// class string_question {
// public static void main(String[] args) {
// //string_q q=new string_q();
// System.out.println(string_q.method("nitin"));

// // static methods can be called without creating an object of the class,
// // which can be convenient if you only need to call the method once or
// // if you don't need to store any data in an object after calling the method.

// }
// }

//------------------------------------------------------------------------------------------------>
// //Min & Max occurence character in Java
// class string_question
// {
//     public static void main(String[] args) {
//         String s="acccabbbcccc";
//         int[] arr=new int [127];
//         for(int i=0;i<s.length()-1;i++)
//         {
//             arr[s.charAt(i)]=arr[s.charAt(i)]+1;
//         }
//         int max=-1;
//         char c='a';
//         for(int i=0;i<s.length();i++)
//         {
//             if(max<arr[s.charAt(i)])
//             {
//                 max=arr[s.charAt(i)];
//                 c=s.charAt(i);
//             }
//         }
//         System.out.println("Max repeated character is  "+c);
//     }
// }



// //Maximum occuring char in string 
// class string_question{
//     int freq[]=new int [256];
//     public void frqq(String str)
//     {
//         int n=str.length();
       
//         for(int i=0;i<n;i++)
//         {
//             freq[str.charAt(i)]++;

//         }
//     }

//     void maxfreq(String str)
//     {
//         int n=str.length();
//         int max=-1;
//         char maxchar=' ';
//         for(int i=0;i<n;i++)
//         {
//             if(freq[str.charAt(i)] > max)
//             {
//                 max=freq[str.charAt(i)];
//                 maxchar=str.charAt(i);
//             }
//         }
//         System.out.println("Max occurring character is: " + maxchar + " with frequency: " + max);
//     }
//     public static void main(String[] args) {
//         string_question sq = new string_question();
//         String str = "sample string";
 
//         sq.frqq(str);
 
//         sq.maxfreq(str);
//     }
// }



//Maximum occuring char in string 
class string_question{
    int freq[]=new int [256];
    public static void frqq(String str)
    {
        int n=str.length();
       
        for(int i=0;i<n;i++)
        {
            freq[str.charAt(i)]++;

        }
    }

    void maxfreq(String str)
    {
        int n=str.length();
        int max=-1;
        char maxchar=' ';
        for(int i=0;i<n;i++)
        {
            if(freq[str.charAt(i)] > max)
            {
                max=freq[str.charAt(i)];
                maxchar=str.charAt(i);
            }
        }
        System.out.println("Max occurring character is: " + maxchar + " with frequency: " + max);
    }
    public static void main(String[] args) {
        string_question sq = new string_question();
        String str = "sample string";
 
        string_question.frqq(str);
 
        sq.maxfreq(str);
    }
}

//------------------------------------------------------------------------------------------------->
//To Captilise Easch Word in JAVA

// import java.lang.reflect.Array;
// import java.util.Arrays;

// class string_question
// {
//     public static void main(String[] args) {

//     String str="vishal";
//     String firstString =str.substring(0, 1);
//     String remaString=str.substring(1);
//     String f=firstString.toUpperCase();
//     System.out.println(f);
//     System.out.println(remaString);
//     System.out.println("The Final String is -"+f+remaString);

//    String ss="my name is raj";
//     String word[]=ss.split("\\s");// Make a String Array
//     //--> \\s help to remove single whitespaces character
//     //split--breaks the string at the separator and it return an array of substring
//     System.out.println(Arrays.toString(word) );//Convert Array to String;
//     System.out.println(String.valueOf(word));

//         String captial="";
//     for(String w:word)
//     {
//         String first=w.substring(0, 1);
//         String last=w.substring(1);
//         captial=captial+first.toUpperCase()+last +" ";
//     }
//     System.out.println(captial);
//     }
// }

//------------------------------------------------------------------------------->

// class string_question
// {
//     public static void main(String[] args) {
//         String srt="my name is raj";
//         String reversrword="";
//         String[] word=srt.split("\\s");
//         for(String w:word)
//         {

//             StringBuffer s=new StringBuffer(w);
//             s.reverse();
//             reversrword+=s.toString()+" ";
//         }
//         System.out.println(reversrword);       
//     }
// }

//------------------------------------------------------------------------------->
//tOGGLE each word in java
// class string_question
// {
//     public static void main(String[] args) {
//         String str="my school is very bigger than you";
//         String[] word=str.split("\\s");
//         String toggle="";
//         for(String w:word)
//         {
//             String first=w.substring(0, 1);
//             String last=w.substring(1);
//             toggle=toggle+first+last.toUpperCase()+" ";

//         }
//         System.out.println(toggle);
//     }
// }

//-------------------------------------------------------------------------------->
//Java String intern()
// class string_question
// {
//     public static void main(String[] args) {

//         String str1=new String("hellow");
//         String str2="hellow";
//         String str3=str1.intern();//returns string from pool,now it will be same as str2
//         System.out.println(str1==str2);//False bcz reference is Different
//         System.out.println(str2==str3);//True bcz ref is same

//         String str=new String ("hellow");
//         String strr=new String ("hellow");
//         System.out.println(str==strr);//false because separate memory is allocated for each string literal.

//         String st=new String ("hellow").intern();
//         String stt=new String ("hellow").intern();
//         //intern() method. Before creating an object in the string pool,
//         //the JVM checks whether the string is already present in the pool or not.
//         //If the string is present, its reference is returned.
//         System.out.println(st==stt);//both st and stt point to same memory
//     }
// }


//------------------------------------------------------------------------------>
//String to Int
// class string_question {
//     public static void main(String[] args) 
//     {
//         String s = "200";
//         int i = Integer.parseInt(s);
//         System.out.println(i);
//     }
// }


//------------------->
//Int to String --3 type;
// class string_question
// {
//     public static void main(String[] args) {
//         int i=100;
//         String s=String.valueOf(i);
//         String ss=Integer.toString(i);
//         String sss=String.format("%d",i);
 
//         System.out.println(s);
//         System.out.println(ss);
//         System.out.println(sss);
//     }
// }

//----------------------------------------------------------------------------->
//String to Date


// import java.text.SimpleDateFormat;  
// import java.util.Date; 
// class string_question
// {
//     public static void main(String[] args)throws Exception
//     {
//         String d="2/11/2002";
//         Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d);
//         System.out.println(date1);
//     }
// }

//------------------------------------------------------------------------------------->
//Check two String are anagram or not?
//is they contain same set of character but in different order?
// import java.util.Arrays;  
// class string_question
// {
//     public static void isAnagram(String str1,String str2)
//     {
//         String str=str1.replaceAll("\\s","");
//         String st=str2.replaceAll("\\s","");

//         Boolean status=true;
//         if(str.length()!=st.length())
//         {
//             status=false;
//         }
//         else
//         {
//             char[] arr1=str.toLowerCase().toCharArray();
//             char[] arr2=st.toLowerCase().toCharArray();
//             Arrays.sort(arr1);
//             String s=String.valueOf(arr1);
//             System.out.println(s+ " 1st Character array In sorted order");
//             Arrays.sort(arr2);
//             String p=String.valueOf(arr2);
//             System.out.println(p+ " 2nd Character array In sorted order");
//             System.out.println( s+" and "+p  + " Are anagram in sorted order ");
//             status=Arrays.equals(arr1,arr2);
//             if(status)
//             {
//                 System.out.println( str+" and "+st  + " Are anagram");
//             }
//             else
//             {
//                 System.out.println(str +" and "+ st+ " Are not anagram");
            
//             }

//         }

//     }
//     public static void main(String[] args) {
        
//         isAnagram("keep", "peek");
//         //isAnagram("kep", "pee");

//     }
// }

//-------------------------------------------------------------------------------------->
//Find the percentage of UpperCase, LowerCase, Digit and Special case
// class string_question
// {
//     public static void percent(String str)
//     {
//         int totalchar =str.length();
//         int UpperCase=0;
//         int LowerCase=0;
//         int digit=0;
//         int other=0;
//         for(int i=0;i<str.length();i++)
//         {
//             char ch = str.charAt(i);
            
//             if(Character.isUpperCase(ch))
//             {
//                 UpperCase++;
//             }
//             else
//             if(Character.isLowerCase(ch))
//             {
//                 LowerCase++;
//             }
//             else
//             if(Character.isDigit(ch))
//             {
//                 digit++;
//             }
//             else
//             {
//                 other++;
//             }
//         } 
//         double uppercaseletter=(UpperCase*100)/totalchar;
//         double lowercaseletter=(LowerCase*100)/totalchar;
//         double digitletter=(digit*100)/totalchar;
//         double othercaseletter=(other*100)/totalchar;
//         System.out.println(str);
//         System.out.println(totalchar);
//         System.out.println(uppercaseletter);
//         System.out.println(lowercaseletter);
//         System.out.println(digitletter);
//         System.out.println(othercaseletter);
        

//     }
//     public static void main(String[] args) {
//         percent("India is my country 100%");
//     }
// // }
// int count=0;  
      
// char ch[]= new char[string.length()];     
// for(int i=0;i<string.length();i++)  
// {  
//     ch[i]= string.charAt(i);  
//     if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
//         count++;  
// }  
// return count;  

//------------------------------------------------------------------------->
//Count word in a string
// class string_question{
//     public static String word(String str)
//     {
//         int count=0;
//         char ch[]=new char[str.length()];
//         for(int i=0;i<str.length();i++)
//         {
//             ch[i]=str.charAt(i);
//             if((i>0)&&(ch[i]!=' ') && (ch[i-1]==' ')|| ((ch[0]!=' ')&&(i==0)))
//             {
//                 count++;
//             }
//         }
//         String cout=Character.toString(count);
//         return cout;

//     }
//     public static void main(String[] args) {
//         String s="My name is raj";
//         System.out.println(word(s)+"Words");
//     }
// }

//------------------------------------------------------------------------------>
//Swap two number without thirdparty
// class string_question
// { 
//     public static void main(String[] args) {
//         String s1="Vishal";
//         String s2="kumar";
//         System.out.println("Without Swapping -->"+ s1+" "+s2 );
//         //After swap
//         s1=s1+s2;
//         System.out.println(s1);
//         s2=s1.substring(0, s1.length() - s2.length());
//         s1=s1.substring(s2.length());
//         System.out.println("With Swapping -->"+ s1+" "+s2);
//     } 
// }

