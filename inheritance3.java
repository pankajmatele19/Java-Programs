interface disp1 
{
    default void show() 
    {
        System.out.println("inside show");
    }
}

    interface disp2 
    {
        default void show() 
        {
            System.out.println("inside show1");
        }
    }

class inheritance3 implements disp1,disp2
{
    public void show()
    {
        disp1.super.show();
        disp2.super.show();
    }
    public static void main(String []args)
    {
    inheritance3 c1 = new inheritance3();
    c1.show();
    }
}