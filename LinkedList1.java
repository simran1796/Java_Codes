import java.util.*;
class LinkedList1
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 LinkedList<Integer>a=new LinkedList<Integer>();
 for(int i=0;i<n;i++)
 {
  int b=sc.nextInt();
  a.add(b);
 }
 System.out.println(a);
 a.set(2,99);
 System.out.println(a);
 a.remove(2);
 System.out.println(a);
}
}