import java.util.Scanner;
class Merge
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int m,n,t,p,k,q;
 m=s.nextInt();
 n=s.nextInt();
 p=m+n;
 int a[]=new int[m];
 int b[]=new int[n];
 int ar[]=new int[p];
 for(int i=0;i<m;i++)
 a[i]=s.nextInt();
 for(int j=0;j<n;j++)
 b[j]=s.nextInt();
 for(int i=0;i<m;i++)
 ar[i]=a[i];
 for(k=m,q=0;k<p&&q<n;k++,q++)
 ar[k]=b[q];
 for(int i=0;i<p;i++)
 {
  for(int j=0;j<p-1;j++)
  {
   if(ar[j]>ar[j+1])
   {
    t=ar[j];
    ar[j]=ar[j+1];
    ar[j+1]=t;
   }
  }
 }
 for(int i=0;i<p;i++)
 System.out.println(ar[i]);
}
}