import java.util.Scanner;
class Data
{
 Data()
 { System.out.println("Base");}
 String st;
 int roll;
 void in()
 {
  Scanner s=new Scanner(System.in);
  roll=s.nextInt(); 
  st=s.next();
 }
 void out()
 {
  System.out.println("Roll no.="+roll);
  System.out.println("Name="+st);
 }
}
class Marks extends Data
{
 Marks()
 { System.out.println("Derived");}
 int a[]=new int[3];
 void in1()
 {
  Scanner s=new Scanner(System.in);
  for(int i=0;i<3;i++)
  a[i]=s.nextInt();
 }
 void out1()
 {
  System.out.print("Marks= ");
  for(int i=0;i<3;i++)
  System.out.print(a[i]+" ");
 }
}
class Stu1 extends Marks
{
public static void main(String args[])
{
 Stu1 obj=new Stu1();
 obj.in();
 obj.in1();
 obj.out();
 obj.out1();
}
}