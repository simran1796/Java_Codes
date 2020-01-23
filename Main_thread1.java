class A extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
 try
 {
 Thread.sleep(1000);
 }
 catch(Exception e)
 {System.out.println(e);}
}
System.out.println("Thread:"+Thread.currentThread().getName());
}
}
class Main_thread1
{
public static void main(String args[]) 
{
A a=new A();
a.start();
}
}