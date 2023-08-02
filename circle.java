import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        double radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius ");
        radius = sc.nextFloat();

        double area= 3.14*radius*radius;
        System.out.println("Area of circle is : "+area);

        double Perimeter= area*area;
        System.out.println("Perimeter of circle is : "+Perimeter);
    }
}