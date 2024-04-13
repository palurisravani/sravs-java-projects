public class Prime number
{
public static void main(String[] args)
{
int num=2;
int count=1;
if(num>1)
{
for(int i=1;1<=num;i++)
{
if(num%i==0)
count++;
}
if(count==2)
{
System.out.println("it is prime number");
}
else
{
System.out.println("it is not prime number");
}
}
}
}