abstract class A
{
    abstract void show();
    void print()
    {
        System.out.println("print() method");
    }
}
class Main extends A 
{
    void show()
    {
        System.out.println("display() method");
    }
    public static void main(String[] args)
    {
        A obj=new Main();
        obj.show();   
        obj.print();
    }
    }
