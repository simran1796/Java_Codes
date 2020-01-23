import java.util.Scanner;
class Marks
{
 Marks()
 { System.out.println("Base");}
 int a[]=new int[3];
 String st;
 int roll;
 void in()
 {
  Scanner s=new Scanner(System.in);
  roll=s.nextInt(); 
  st=s.next();
  for(int i=0;i<3;i++)
  a[i]=s.nextInt();
 }
 void out()
 {
  System.out.println("Roll no.="+roll);
  System.out.println("Name="+st);
  System.out.println("Marks= ");
  for(int i=0;i<3;i++)
  System.out.print(a[i]+" ");
 }
}
class Stu extends Marks
{
public static void main(String args[])
{
 Stu obj=new Stu();
 obj.in();
 obj.out();
}
}