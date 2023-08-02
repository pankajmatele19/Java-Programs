import java.util.Scanner;

public class twodArray {
    public static void main(String []args)
    {
        int i,j;
       Scanner sc=new Scanner(System.in);
       int[][] a = new int [3][3];
       for( i=0; i<3; i++)
       {
           for( j=0; j<3; j++)
           {
             System.out.println("Enter number");
             a[i][j]=sc.nextInt();
             System.out.println();
            }
       }
       System.out.println("printing elements");
       for( i=0; i<3; i++)
       {
           System.out.println(); 
           for( j=0; j<3; j++)
           {
               System.out.print(a[i] [j]+"\t");
            
           }
       }
    }
}
