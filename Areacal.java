import java.util.Scanner;
class Ar
{
 void area(int a)
 {System.out.println("Area of square="+a*a);}
 void area(int l,int b)
 {System.out.println("Area of rectangle="+l*b);}
}
class Areacal
{
public static void main(String[] args)
{
 int a,b,c;
 Scanner s=new Scanner(System.in);
 a=s.nextInt();
 b=s.nextInt();
 c=s.nextInt();
 Ar p=new Ar();
 p.area(a);
 p.area(b,c);
}
}