import java.util.Scanner;
class Common
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n,k=0;
  n=s.nextInt();
  int a[]=new int[n];
  int b[]=new int[n];
  int ar[]=new int[10];
  int br[]=new int[n];
  for(int i=0;i<n;i++)
  a[i]=s.nextInt();
  for(int i=0;i<n;i++)
  b[i]=s.nextInt();
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(a[i]==b[j])
    {
    ar[k]=a[i];
    k++;
    }
   }
  }
 for(int i=0;i<k-1;i++)
 {
  for(int j=i+1;j<k;j++)
  {
   if(ar[i]==ar[j])
   {
    ar[j]=-1;
   }
  }
 }
 for(int i=0;i<k;i++)
 {
 if(ar[i]!=-1)
 System.out.println(ar[i]);
 }
 
 }
}