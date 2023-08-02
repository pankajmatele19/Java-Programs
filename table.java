import java.util.Scanner;

public class table 
{
    public static void main(String []args)
    {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc1.nextInt();

        for (int i=1; i<=10; i++)
        {
            System.out.println(i*num);
        }
        sc1.close();
    }
}


