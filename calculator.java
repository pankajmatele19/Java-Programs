import java.util.Scanner;

public class calculator 
{

    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc1.nextInt();
        System.out.println("Enter number");
        int b = sc1.nextInt();
        int result;
        result = add(a, b);
        System.out.println("addition is " + result);
        sc1.close();

    }
}