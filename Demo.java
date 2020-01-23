import java.util.Scanner;
interface intr
{
 final int l=10;
 void area();
}
class Sq implements intr
{
 public void area()
 {System.out.println("Area of Square:"+l*l);}
}
class Rec implements intr
{
 int b;
 public void area()
 {
 Scanner sc=new Scanner(System.in);
 b=sc.nextInt();
 System.out.println("Area of Rectangle:"+l*b);}
}
class Cub implements intr
{
 int b,h;
 public void area()
 {
 Scanner sc=new Scanner(System.in);
 b=sc.nextInt();
 h=sc.nextInt();
 int v=2*((l*b)+(b*h)+(l*h));
 System.out.println("Area of Cuboid:"+v);
 }
}
class Demo 
{
 public static void main(String args[])
 {
  Sq s=new Sq();
  Rec r=new Rec();
  Cub c=new Cub();
  s.area();
  r.area();
  c.area();
 }
}