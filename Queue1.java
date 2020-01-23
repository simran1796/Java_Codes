import java.util.*;
class Queue1
{
public static void main(String args[])
{
Queue<Integer>q=new LinkedList<Integer>();
int n=5;
for(int i=0;i<n;i++)
{
q.add(i*10);
}
System.out.println(q);
q.remove();
System.out.println(q);
System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q);
System.out.println(q.element());
System.out.println(q.size());
}
}