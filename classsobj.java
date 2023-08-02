
class classobj 
{
    public void mycar()
    {
        System.out.println("Hello!");
    }
    public void mybike(int speed)
    {
        System.out.println("My top speed is "+speed);
    }
    public static void main (String []args){

        classobj sc=new classobj();
        sc.mycar();
        sc.mybike(150);
    }
    

}