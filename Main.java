import java.util.Scanner;
class Dist
{
 int km,m;
 void set()
 {
  Scanner s=new Scanner(System.in);
  km=s.nextInt();
  m=s.nextInt(); 
 }
 void add(Dist d)
 {
  int r1,r2,a,b;
  r1=km*1000+m;
  r2=d.km*1000+d.m;
  r1+=r2;
  a=r1/1000;
  b=r1%1000;
  System.out.print("Addition= "+a);
  System.out.print("kms ");
  System.out.println(b+"ms ");
 }
 void sub(Dist d)
 {
  int r1,r2,a,b,c;
  r1=km*1000+m;
  r2=d.km*1000+d.m;
  if(r1>r2)
  c=r1-r2;
  else if(r1<r2)
  c=r2-r1;
  else
  c=0;
  a=c/1000;
  b=c%1000;
  System.out.print("Subtraction= "+a);
  System.out.print("kms ");
  System.out.print(b+"ms ");
 }
}
class Main
{
public static void main(String args[])
{
 Dist p=new Dist();
 Dist q=new Dist();
 p.set();
 q.set();
 p.add(q);
 p.sub(q);
}
}