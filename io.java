import java.io.FileOutputStream;
class FileoutputStreamExample
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
        catch(Expection e)
        {
            System.out.println(e);
        }
        }
        }