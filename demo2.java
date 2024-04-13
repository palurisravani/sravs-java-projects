public class demo2
{
int add()
{
int a = 12, b = 23;
int c=a+b;
System.out.println(c);
return c;
}
public static void main(String[] args)
{
int d= new demo2().add();
System.out.println(d);
}
}
