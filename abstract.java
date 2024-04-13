abstract class A
{
abstract void show();
void print()
{
System.out.println("print()method");
}
}
class main extends A
{
void show()
{
System.out.println("show()method");
}
void display()
{
System.out.println("display()method");
}
public static void main(String[] args)
{
abstract obj = new abstract();
obj.show();
obj.display();
obj.print();
}
}