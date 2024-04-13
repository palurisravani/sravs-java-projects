import java.util.*;
class addB
{
public static void main(String[] args)
{
Stack s=new Stack();
s.push(6);
s.push(11);
System.out.println(s.toString());
s.pop();
System.out.println(s);
Enumeration e = s.elements();
while(e.hasMoreElements());
{
System.out.println(e.nextElement());
}
}
}
