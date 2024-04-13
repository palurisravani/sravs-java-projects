class Employee1
{
    private int age;
    public void setAge(int age)
    {
        if(age>100)
        {
            this.age=100;
        }
    else if(age>0)
    {
        this.age=0;
    }
    else
    {
        this.age=age;
    }
    }
    public int getAge()
{
return age;
    }
    }
    class Main
    {
        public static void main(String[] args)
        {
            Employee1 obj=new Employee1();
            obj.setage(20);
            int x=obj.getAge();
            System.out.println("The age of employee is:"+x);
        } 
    }