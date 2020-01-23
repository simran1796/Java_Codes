import java.util.Scanner;
class Multiply
{
 int n;
 int a[][]=new int[10][10];
 int b[][]=new int[10][10];
 Multiply(int ar)
 {
  n=ar;
 }
 void in()
 {
  Scanner s=new Scanner(System.in);
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  a[i][j]=s.nextInt();
  }
 }
 void mult(Multiply m)
 {
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  {
   for(int k=0;k<n;k++)
   b[i][j]+=a[i][k]*m.a[k][j];
  }
  }
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  System.out.print(b[i][j]+" ");
  System.out.println();
  }
 }
}
class Mat
{
public static void main(String args[])
{
 int n;
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 Multiply p=new Multiply(n);
 Multiply q=new Multiply(n);
 p.in();
 q.in();
 p.mult(q);
}
}