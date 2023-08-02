import java.lang.Thread;

class C implements Runnable
{
    public void run()
    {
        int i;
        for(i=0; i<=10; i++)
    {
        System.out.println("Inside C"+i);
    }    
    }
}
class B implements Runnable
{
    public void run()
    {
        int i;
        for(i=0; i<=10; i++)
    {
        System.out.println("Inside B"+i);
    }    
    }
}
public class thread1 {

    public static void main(String []args)
    {
        Thread t1 = new Thread(new C());
        t1.start();
        Thread t2 = new Thread(new B());
        t2.start();
    }
    
}
