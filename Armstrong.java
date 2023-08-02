import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) 
    {
        int num,check,rem,sum=0;

        System.out.println("Enter number ");
        Scanner sc1= new Scanner(System.in);
        num= sc1.nextInt();
        check=num;
        while(check!=0)
        {
            rem=check%10;
            sum= sum +(rem*rem*rem);
            check= check/10;
        }
        if (sum==num)
        {
            System.out.println(num+ " is armstrong number");
        }
        else 
        {
            System.out.println(num+" is not armstrong number");
        }
        sc1.close();
    }

}
