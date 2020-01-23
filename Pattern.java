import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int s=n;
 for(int i=0;i<n;i++)
 {
  for(int j=0;j<s;j++)
  System.out.print(" ");
 
  for(int k=0;k<i;k++)
  System.out.print("* ");
  
  System.out.println();
  s--;
 }
 s=0;
 for(int i=n;i>0;i--)
 {
  for(int j=0;j<s;j++)
  System.out.print(" ");

  for(int k=0;k<i;k++)
  System.out.print("* ");

  System.out.println();
  s++;
 }
}                              
}