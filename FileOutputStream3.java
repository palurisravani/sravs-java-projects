import java.io.FileOutputStream;
class FileOutputStream3
{
public static void main(String args[])
{
try(FileOutputStream fileOutputStream=new FileOutputStream("java"))
{
String msg="Welcome to java";
byte byteArray[]=msg.getBytes();
fileOutputStream.write(byteArray);
System.out.println("success...");
}
catch(Exception e)
{
System.out.println(e);
}
}
} 