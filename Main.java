class Main
{
int x = 5;
void show()
{
System.out.println(this.x);
}
public static void main(String[]args)
{
Main d = new Main();
Main d1 = new Main();
d.x = d1.x+3;
d.show();
d1.show();
}
}