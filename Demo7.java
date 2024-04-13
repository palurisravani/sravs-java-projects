public class Demo7
{
int a=10;
int b=12;
public static void main(String[] args)
{
Demo7 obj=new Demo7();
obj.a=25;
new Demo7().b=35;
new Demo7().a=75;
new Demo7().b=35;
System.out.println(obj.a);
System.out.println(new Demo7().b);
System.out.println(new Demo7().a);
}
}