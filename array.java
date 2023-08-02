import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int i;
        int a[] = new int[6];
        Scanner sc1 = new Scanner(System.in);
        for (i = 0; i <=a.length; i++) {
            System.out.println("Enter element");
            sc1.nextInt();
        }
        for (int j = 0; j<=a.length; j++) {


            System.out.println(a[j]);
        }
        sc1.close();

    }
}
