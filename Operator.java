import java.util.Scanner;
class Operator
{
public static void main(String args[])
{
 int a,b;
 Scanner s=new Scanner(System.in);
 a=s.nextInt();
 b=s.nextInt();
 System.out.println(a++);
 System.out.println(++a);
 System.out.println(b--);
 System.out.println(--b);
 System.out.println(a%2);
 a+=2;
 b-=2;
 System.out.println(a);
 System.out.println(b);
 if(a>b)
 System.out.println("a is greater");
 else
 System.out.println("b is greater");
 if(a>0&&b>0)
 System.out.println("Positive numbers");
 else
 System.out.println("At least one number is positive");
 if(a%2!=0)
 System.out.println("A is not an even number");
 else
 System.out.println("A is even number");
}
}