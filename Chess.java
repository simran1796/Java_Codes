import java.util.Scanner;
class Chess
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter your input:");
 int a=sc.nextInt();
 char b=sc.next().charAt(0);
 int c=(int)b;
 if(a<=26&&c<=122)
{
 if((a%2==0&&c%2==0)||(a%2!=0&&c%2!=0))
 System.out.println("Black");
 else if((a%2==0&&c%2!=0)||(a%2!=0&&c%2==0))
 System.out.println("White");
}
 else 
{ System.out.print("INPUT INVALID");}
}
}