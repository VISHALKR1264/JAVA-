import java.util.HashMap;
import java.util.LinkedHashMap;

public class word_wrap_freq {
    public static void wrap_using_StringBuilder(String str,int n)
    {
        if (str == null || str.length() == 0) {
            System.out.println(str);  // Handle empty or null input
            return;
        }
    
        StringBuilder sb=new StringBuilder();
        int count=1;
        char c=str.charAt(0);
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i)==c)
            {
                count++;
            }
            else
            {
                sb.append(c);
                if (count > 1) {
                    sb.append(count);
                }
                c=str.charAt(i);
                count=1;
            }
        }

        sb.append(c);
        if (count > 1) {
            sb.append(count);
        }

        System.out.println();
        System.out.println(sb.toString());
    }
    public static void wrap_frequency_string(String str,int n)
    {
        LinkedHashMap <Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        // Input :

        // abbccccc
        
        // Output :
        
        // ab2c5
        // To solve this issue use StringBuilder and append key 'ch' and value only if it is greater than 1;

        StringBuilder sb=new StringBuilder();
        for (var dis : map.entrySet())
        {
            char key=dis.getKey();
            int value =dis.getValue();
            sb.append(key);

            if (value > 1) {
                sb.append(value);
            }
        }
        System.out.println(sb.toString());
    }
    public static void wrap_frequency(char[] arr,int n)
    {
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ch : arr)
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(var entry : map.entrySet())
        {
            System.out.printf(entry.getKey() +""+entry.getValue());
        }
        
    }
    public static void main(String[] args) {
        char[] ch=new char[]{'a','a','a','b','n','n'};
        int len=ch.length;
        wrap_frequency(ch,len);
        
        String str="kaabbccnnmm";
        System.out.println();
        wrap_frequency_string(str,str.length());
        wrap_using_StringBuilder(str,str.length());
    }
}
