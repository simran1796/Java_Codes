import java.util.Scanner;
class Try2
{
public static void main(String args[])
{
 System.out.println("Press 1 for String,2 for out of array,3 for division");
 Scanner sc=new Scanner(System.in);
 int c=sc.nextInt();
 try
 {
  if(c==1)
  {
  String s=null;
  System.out.println(s.length());  
  }
  else if(c==2)
  {
   int a[]=new int[5];
   System.out.println(a[5]);
  }
  else if(c==3)
  {
   System.out.println(5/0);
  }
 }
 catch(NullPointerException|ArrayIndexOutOfBoundsException|ArithmeticException e)
 { System.out.println(e); }

}
}