import java.util.Scanner;  
public class Sumusingloop{  
	public static void main(String args[]){ 
		Scanner input = new Scanner(System.in); 
		int sum = 0; 
		for (int i = 0; i < 10; i += 1){ 
            System.out.print("Enter number: ");
			sum += input.nextInt(); 
		} 
		System.out.println("The total sum is: " + sum ); 
	} 
}