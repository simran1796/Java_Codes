import java.util.*;
class Stack1
{
public static void main(String args[])
{
Stack<Integer>s=new Stack<Integer>();
int n=5;
for(int i=0;i<n;i++)
{
s.push(i*10);
}
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.empty());
System.out.println(s.search(10));
}
}