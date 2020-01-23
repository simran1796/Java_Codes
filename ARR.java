import java.util.Scanner;
class ARR
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
 int n,a,t,k,p;
 System.out.println("Enter the number of elements");
 n=s.nextInt(); 
 int ar[]=new int[n];
 System.out.println("Enter the elements");
 for(int i=0;i<n;i++)
 ar[i]=s.nextInt();
 System.out.println("Enter the value to search");
 a=s.nextInt();
 for(int i=0;i<n;i++)
 {
  if(ar[i]==a)
  System.out.println(i);
 }
 for(int i=0;i<n;i++) 
 {
  for(int j=0;j<n-1;j++)
  {
    if(ar[j]>ar[j+1])
    {
      t=ar[j];
     ar[j]=ar[j+1];
     ar[j+1]=t;
    }
  }
 }
 for(int i=0;i<n;i++)
 System.out.println(ar[i]);
 System.out.println("Enter the value for left rotation");
 k=s.nextInt();
 for(int i=0;i<k;i++)
 {
  p=ar[0];
  for(int j=0;j<n-1;j++)
  ar[j]=ar[j+1]; 
  ar[n-1]=p;
 }
 for(int i=0;i<n;i++)
 System.out.println(ar[i]);
 }
}