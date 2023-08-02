interface inter1
{
    default void show()
    {
        System.out.println("Inside SHOW");
    }
}
interface inter2
{
    default void show1()
    {
        System.out.println("inside show1");
    }
    default void show2()
    {
        System.out.println("inside show2");
    }
}
public class inheritance2 implements inter1,inter2
{
    public void show3()
    {
        System.out.println("inside show3");
    }
    public static void main(String[] args)
{
    inheritance2 c1=new inheritance2();
    c1.show();
    c1.show1();
    c1.show2();
    c1.show3();
}
}