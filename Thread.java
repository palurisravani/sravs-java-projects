class A1 extends Thread 
{
    public void run()
    {
        System.out.println("preethi");
    }
    public static void main(String args[])
    {
        A1 obj = new A1();
        Thread obj1 = new A1();
        Thread obj2 = new Thread(new A1());
        obj.start();
        System.out.println(Thread.currentThread().getPriority());
    }
} 