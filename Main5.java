class Main5
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
Main5 obj=new Main5();
obj.add(35,23,13);
obj.add(12,15);
}
}