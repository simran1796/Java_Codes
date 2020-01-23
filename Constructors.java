import java.util.Scanner;
class A
{
 int x;
 A(int a)
 {
  System.out.println("a="+a);
 }
}
class B extends A
{
 int y;
 B(int a,int b)
 {
  super(a);
  y=b;
  System.out.println("b="+b);
 }
}
class Constructors
{
public static void main(String args[])
{
 B b=new B(8,27);
}
}
                                                                                   