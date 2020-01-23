import java.util.*;
class ArrayList1
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
 a.add(2,99);
 System.out.println(a);
 a.remove(2);
 System.out.println(a);
 Collections.sort(a);
 System.out.println(a);
 Collections.reverse(a);
 System.out.println(a);
}
}