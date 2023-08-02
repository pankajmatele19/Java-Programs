import java.util.*;

public class ClassandMethod {
    public static void main (String[] args) {
        // person p1 = new person();
        // p1.name = "Pankaj";
        // p1.age = 19;
        // // System.out.println(p1.name+ " "+p1.age);
        // person p2 = new person();
        // p2.name = "Dhevaakar";
        // p2.age = 20;

        Scanner sc = new Scanner(System.in);
        person p3 = new person(20, "kiran");

        person p4 = new person(21, "arpit");
        System.out.println(p3.name+ " "+p3.age);
        System.out.println(p4.name+ " "+p4.age);
//        p3.driving();
//        p3.walking();
//        p4.driving();
        p4.walking();

 
//        System.out.println(person.count);
    }
}

class person {
    String name;
    int age;

    static int count;
    Scanner sc = new Scanner(System.in);
//    void walking() {
//        System.out.println(name + " is walking");
//    }
//    void driving() {
//        System.out.println(name + " is Driving");
//    }
    void walking() {
        System.out.println("Enter Steps");
        int steps = sc.nextInt();
        System.out.println(name + " walked " + steps+ " steps");
    }
//    public person() {
//        count++;
//        System.out.println("creating an object");
//    }
    public person(int age , String name) {
        this.age = age;
        this.name = name;
    }
}