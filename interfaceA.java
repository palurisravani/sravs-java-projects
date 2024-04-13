interface A
{
public static final int a=5;
public abstract void show();
}
class Main implements A
{
int b=10;

public void show()
{
System.out.println("show()method");
}
void print()
{
System.out.println("print()method");
}
public static void main(String[] args)
{
Main obj=new Main();
obj.show();
obj.print();
System.out.println(obj.a);
System.out.println(obj.b);
}
}