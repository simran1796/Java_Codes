class A extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("Thread:"+Thread.currentThread().getName());
}
}
class Main_thread3
{
public static void main(String args[]) 
{
A a=new A();
A b=new A();
A c=new A();
a.start();
try
{ a.join();}
catch(Exception e)
{System.out.println(e);}
b.start();
c.start();
}
}