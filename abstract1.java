abstract class abstract1 
{
    abstract void draw();
    public void get()
    {
        System.out.println("Hello");
    }    
}
class show extends abstract1
{
    void draw()
    {
        System.out.println("hello");
    }
    public static void main(String []args)
    {
        show s=new show();
        s.get();
        s.draw();
    }
}

