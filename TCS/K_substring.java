public class K_substring {
    public static void main(String[] args) {
        String s="MY NAME IS VISHAL KUMAR";
        int k=5,count=0,space=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                count++;
                if(count == k)
                {
                //    System.out.println(s.substring(0, i));
                space =i;
                   break;
                }
            }
        }
        
        if(space != -1)
        {
            System.out.println(s.substring(0, space));
        }
        else{
            System.out.println(" INVALID ");
        }
        
    }
}

