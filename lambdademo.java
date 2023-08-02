interface A
{
    void show();
}
public class lambdademo {
    public static void main(String []args)
    {
        A obj;
        obj=()->System.out.println("Hello");
        obj.show();

    }
    
}
