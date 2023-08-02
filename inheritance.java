public class inheritance {
    public void student() {
        System.out.println("All info about students");
    }
    public void exam() {
        System.out.println("All info about exam");
    }
    public void sports() {
        System.out.println("All info about sports");
    }
}

class fystudent extends inheritance {
    public void social() {
        System.out.println("All info about social");
    }
    public static void main(String []args) {
         fystudent f1=new fystudent();
         f1.exam();
         f1.sports();
         f1.student();
         f1.social();

    }
}
