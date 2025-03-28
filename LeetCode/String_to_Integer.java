class String_to_Integer {
    public int myAtoi(String s) 
    {
        if(s==null)
        {
            return 0;
        }
        
        //s=s.trim();//All the white spaces are removed
        int j=0;
        while( j <s.length() && s.charAt(j)==' ')
        {
            j++;
        }
        s=s.substring(j);
        //////////////////////alternate method from trim
        if(s.length() ==0)
        {
            return 0;
        }

        int sign=+1; //check in first agr first me '-' hua to last me value se * kr denge 
        long ans=0;
        if(s.charAt(0) == '-')
        {
            sign=-1;//agr pehle hi '-' hai to store it
        }
        int MAX=Integer.MAX_VALUE,MIN=Integer.MIN_VALUE;
        //Initilazing the starting point
        // int i=(s.charAt(0)=='+' || s.charAt(0)=='-')? 1 : 0 ;
        int i;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            i = 1;
        } else {
            i = 0;
        } 
        //////////////////
        while(i<s.length())
        {
            if(s.charAt(i)==' '|| !Character.isDigit(s.charAt(i))) //agr aage badhte badhte koi v space aaye yaa char start ho to break 
            {
                break;
            }
            ans = ans * 10 + (s.charAt(i) - '0');// if i=1 then ans =1st digit but if i=2 so it had to be 2 digit so mul with 10 and add the 2nd char to make it integer -'0';
            if(sign ==-1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            i++;
        }
        return (int)(sign*ans);
    } 
    public static void main(String[] args) {
        String str="  -32244jdgfdg";
        String_to_Integer sc=new String_to_Integer();
        System.out.println("Vlue is: "+sc.myAtoi(str));
    }
}