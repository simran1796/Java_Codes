import java.util.Scanner;
class Rotate
{
public static void main(String args[])
{
 int a[][]=new int[3][3];
 int b[][]=new int[3][3];
 int c[][]=new int[3][3];
 int p,q;
 Scanner s=new Scanner(System.in);
 for(int i=0;i<3;i++)
 {
  for(int j=0;j<3;j++)
  a[i][j]=s.nextInt();
 }
 for(int i=0;i<3;i++)
 {
  for(int j=0;j<3;j++)
  b[i][j]=a[j][i];
 }
 for(int i=0;i<3;i++)
 {
  for(p=0,q=2;p<3&&q>=0;p++,q--)
  c[i][p]=b[i][q];
 }
 for(int i=0;i<3;i++)
 {
  for(int j=0;j<3;j++)
  System.out.print(c[i][j]+" ");
  System.out.println();
 }
}
}