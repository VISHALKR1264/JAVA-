
public class Is_ArmStrong {
    public static void main(String[] args) {
        int num=153;
        int OrgNo=num;
        int len=String.valueOf(num).length();

        int armstrong=0;
        for(int i=0;i<len;i++)
        {
            int digit=num%10;
            armstrong = armstrong +(int) Math.pow(digit, len);
            num=num/10;
        }
        System.out.printf (armstrong == OrgNo? "ArmStrong" : "NOT an ArmStrong");
    }
}
