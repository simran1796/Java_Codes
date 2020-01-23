import java.util.Scanner;
class GenDemo<T,U>
{
 T obj1;
 U obj2;
 GenDemo(T obj1,U obj2)
 {
 this.obj1=obj1;
 this.obj2=obj2;
 }
 void add()
 {System.out.println("Add:"+(obj1));}
 void sub()
 {System.out.println("Sub:"+(obj1));}
 void mul()
 {System.out.println("Mul:"+(obj1));}
 
}
class Gen1
{
public static void main(String args[])
{
 GenDemo<Integer,Integer>g1=new GenDemo<Integer,Integer>(5,1);
 GenDemo<Integer,Integer>g2=new GenDemo<Integer,Integer>(4,2);
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 1,2,3,4 for add,sub,mul,div");
 int n=sc.nextInt();
 if(n==1)
 {
  g1.add();
  g2.add();
 }
 else if(n==2)
 {
  g1.sub();
  g2.sub();
 }
 else if(n==3)
 {
  g1.mul();
  g2.mul();
 }
 else
 System.out.println("Wrong choice");
}
}