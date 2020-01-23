import java.util.Scanner;
class Try
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int a[][]=new int[3][];
 int c[]=new int[3];
 for(int i=0;i<3;i++)
 {
  c[i]=s.nextInt();
  a[i]=new int[c[i]];
  for(int j=0;j<c[i];j++)
  a[i][j]=s.nextInt();
 }
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<c[i];j++)
 System.out.print(a[i][j]+" ");
 System.out.println();
 }
}
}