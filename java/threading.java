class A1 implements Runnable
{
       public void run()
       {
        int i;
        for (i = 0; i <=10; i++)
       System.out.println("thread A1"+i);
       }
}
class A2 implements Runnable
{
    public void run()
    {
    int i;
        for(i=0;i<=10;i++)
     System.out.println("thread A2"+i);
    }
}
public class threading
{
    public static void main(String args[])
    {
        Thread t1=new Thread(new A1());
        Thread t2=new Thread(new A2());
        t1.start();
        t2.start();
    }
}