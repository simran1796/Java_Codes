import java.util.Scanner;
class Account
{
  int bal,dep;
  public Account(int m)
  {bal=m;}
  synchronized public boolean is_suff1(int w)
  {
    if(bal>=w)
      return true;
    else
      return false;
  }
  synchronized public boolean is_suff2(int w)
  {
    if(w>5000)
      return true;
    else
      return false;
  }
  synchronized public void withdraw(int amt)
  {
    bal=bal-amt;
    System.out.println("Current Balance"+bal);
  }
  synchronized public void deposit(int amt)
  {
    bal=bal+amt;
    System.out.println("Current Balance"+bal);
  }
}
class customer implements Runnable
{
  Account acc;
  String name;
  public customer(Account a,String n)
  {
    acc=a;
    name=n;
  }
  public void run()
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter amount to withdraw");
    int amt=s.nextInt();
    System.out.println("Enter amount to deposit");
    int dep=s.nextInt();
    if(acc.is_suff1(amt))
      acc.withdraw(amt);
    else
      System.out.println("Insufficient balance");
    if(acc.is_suff2(dep))
      acc.deposit(dep);
    else
      System.out.println("Deposit more money");
  }
}
public class Threadsync2
{
  public static void main(String args[])
  {
   Account a1=new Account(5000);
   customer c1=new customer(a1,"Ram");
   customer c2=new customer(a1,"Sham");
   Thread t1=new Thread(c1);
   Thread t2=new Thread(c2);
   t1.start();
   t2.start();
  }
}
