import java.util.Scanner;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            l1.add(sc.nextInt());
        }

        for(int i=0; i<10; i++){
            System.out.print(l1.get(i) + " ");
        }
    }

}
