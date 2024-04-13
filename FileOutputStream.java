import java.io.FileOutputStream;
class FileOutputStreamExample
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("sravs");
            fout.write(65);
            fout.flush();
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        }