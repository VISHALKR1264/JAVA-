public class guest_on_cruse {
    public static void main(String[] args) {
        int t=3;
        int e[]=new int[]{7,0,5,1,3};
        int l[]=new int[]{1,2,1,3,4};
        int max_ans=0,sum=0;
        for(int i=0;i<t;i++)
        {
            sum+=e[i]-l[i];
            System.out.println("Guests at time point " + (i + 1) + ": " + sum);
            max_ans=Math.max(max_ans, sum);
        }
        System.out.println("Maximum number of guests present at any time point: "+max_ans);
    }
}

