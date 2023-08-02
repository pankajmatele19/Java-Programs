import java.util.Scanner;

public class switchex {

    public static void main(String []args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num1=input.nextInt();
        System.out.println("Enter number");
        int num2=input.nextInt();    
        System.out.println("Enter operation ");
        int operator=input.nextInt();

        switch(operator) 
        {
            case 1 :
            System.out.println("Addition is :"+(num1+num2));
            break;

            case 2 :
            System.out.println("Subtraction is :"+(num1-num2));
            break;

            case 3 :
            System.out.println("Division is :"+(num1/num2));
            break;

            case 4 :
            System.out.println("Multiplication is :"+(num1*num2));
            break;

            default :
            System.out.println("Invalid");

        }
        input.close();
    }
    
}
