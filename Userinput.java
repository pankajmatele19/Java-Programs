import java.util.Scanner;

public class Userinput
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println("enter number");
        int b=sc.nextInt();
        System.out.println("enter number");
        int c=sc.nextInt();
        int d=a+b+c;
        System.out.println("Addition :"+d);
        int e=c-a-b;
        System.out.println("subtraction :"+e);
        int f=a*b*c;
        System.out.println("multiplication :"+f);
        sc.close();

    }
}