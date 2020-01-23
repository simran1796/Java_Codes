class A extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("Thread:"+Thread.currentThread().getName());
}
}
class B extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
System.out.println("Thread:"+Thread.currentThread().getName());
}
}
class Main_thread
{
public static void main(String args[]) 
{
A a=new A();
B b=new B();
a.start();
b.start();
}
}