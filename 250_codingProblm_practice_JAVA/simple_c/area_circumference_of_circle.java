
public class area_circumference_of_circle {
    public static void main(String[] args) {

        double circumfrernce, area = 0;
        double pi = 3.14;
        float r = 3;
        area = Math.PI * (r * r);
        circumfrernce = 2 * pi * r;
        System.out.println(area + " is  Area of Circle && Circumference of circle =" + circumfrernce);
        System.out.printf("Area of Circle is %.2f && Circumference of circle is %.2f%n", area, circumfrernce);
        String formattedOutput = String.format("Area of Circle is %.2f && Circumference of circle is %.2f", area, circumfrernce);
        System.out.println(formattedOutput);

    }
}
