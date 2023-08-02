import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i;
        i = scan.nextInt();
        double d;
        d = scan.nextDouble();
        scan.nextLine();
        String s;
        s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
