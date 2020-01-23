import java.util.Scanner;
class Date
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int d=sc.nextInt();
 String s=sc.next();
 if(d==1&&s.equals("January"))
 System.out.println("New Year's day");
 else if(d==1&&s.equals("July"))
 System.out.println("Canada day");
 else if(d==25&&s.equals("December"))
 System.out.println("Christmas day");
 else
 System.out.println("No holiday");
}
}