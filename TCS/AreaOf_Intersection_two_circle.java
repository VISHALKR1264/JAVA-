public class AreaOf_Intersection_two_circle {
    long intersectionArea(double X1, double Y1, double R1, double X2, double Y2,
                          double R2) {
        // code here
        double d=Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
        if(d>=(R1+R2)) //circle is not overlapping
        {
            return 0;
        }
        
        //if circle is completely inside the other
        if(d <= Math.abs(R1-R2))
        {
            return (long)Math.floor(3.14 * Math.min(R1,R2)*Math.min(R1,R2));//pi(r)^2;
        }
        
        //Intersection area part
        double part1=R1*R1*Math.acos((d*d + Math.pow(R1, 2) - Math.pow(R2, 2))/(2*d*R1));
        double part2=R2*R2*Math.acos((d*d +R2*R2 - R1*R1)/(2*d*R2));
        double part3=0.5*Math.sqrt((-d +R1+R2) *(d + R1-R2)* (d-R1+R2) *(d+R1+R2));
        double intersectionArea =part1+part2-part3;
        
        return (long)Math.floor(intersectionArea);
        
    }

    public static void main(String[] args) {
        double X1=0,Y1=0,R1=4;
        double X2=6,Y2=0,R2=4;
        
        AreaOf_Intersection_two_circle sc=new AreaOf_Intersection_two_circle();
        long area = sc.intersectionArea(X1, Y1, R1, X2, Y2, R2);
        System.out.println("Intersection Area: " + area);


    }
}
