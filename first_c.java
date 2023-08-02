public class first_c
 {
    public void mymethod()
    {
        System.out.println("Method");
    }
    public void first()
    {
        System.out.println("Constructor");
    }
    static{
        System.out.println("Static block");
    }
    public static void main(String []args)
    {
        first_c c = new first_c();
        c.mymethod();
    }
}
