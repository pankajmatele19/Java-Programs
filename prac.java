class data 
{
    public void displayinfo() 
    {
        System.out.println("data is in superclass");
    }

}

class datanew extends data 
{

    public void displayinfo() 
    {
        super.displayinfo();
        System.out.println("this is subclass");
    }

    public static void main(String[] args) 
    {
        datanew c1 = new datanew();
        c1.displayinfo();
    }
}
