public class final1 {

    final int i=10;
    
    public void get()
    {
        System.out.println("Printing i : "+i);
        int i=120;
        System.out.println("again printing i : "+i);
    }

    public static void main(String []args)
    {
        final1 sc1= new final1();
        sc1.get();
    }
}
