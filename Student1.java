class Student1
{
int id;
String name;
int age;
Student1(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+""+name+""+age);
}
public static void main(String[] args)
{
Student1 s1 = new Student1(111,"sravs",19);
Student1 s2= new Student1(222,"sravani",20);
s1.display();
s2.display();
}
}
