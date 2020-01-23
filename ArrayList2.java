import java.util.*;
class ArrayList2
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 ArrayList<Integer>a=new ArrayList<Integer>();
 for(int i=0;i<n;i++)
 {
  int b=sc.nextInt();
  a.add(b);
 }
 System.out.println(a);
 System.out.println("Enter the value and index to update:");
 int p=sc.nextInt();
 int q=sc.nextInt();
 a.set(p,q);
 System.out.println(a);
}
}