public class Classexample {
    public void display()
    {
        System.out.println("Inside display method");
    }
    public void display1()
    {
        System.out.println("Inside display1 method");
    }
public static void main(String []args)
{
    Classexample c1=new Classexample();
    c1.display();
    c1.display1();

    Classexample c2=new Classexample();
    c2.display1();
}
}
