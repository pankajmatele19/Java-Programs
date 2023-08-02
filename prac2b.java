import java.util.*;

class oddeven implements Runnable {
    int i, a;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        a = sc.nextInt();
        i = 2;
        {
            if (a % i == 0) {
                System.out.println(a + " is even");
            } else {
                System.out.println(a + " is odd");
            }
        }
    }
}

public class prac2b {
    public static void main(String[] args) {
        oddeven p = new oddeven();
        Thread t = new Thread(p);
        t.start();
    }
}