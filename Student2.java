import java.io.serializable;
import java.io.*;
public class Student2 implements serialiazable
{
    int id;
    String name;
    public Student2(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
public static void main(String args[])
{
    try
    {
        Student2 s2=new Student2(211,"sravani");
        FileOutputStream fout=new FileOutputStream("sravs");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s2);
        out.flush();
        out.close();
        System.out.println("success");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
