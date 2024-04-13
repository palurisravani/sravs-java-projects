class Main4
{
void add(int a,int b)
{
System.out.println(a+b);
}
private void add(int b,int a,int c)
{
System.out.println(a+b+c);
}
public static void main(String[] args)
{
Main obj=new Main();
obj.add(35,23,13);
obj.add(12,15);
}
}