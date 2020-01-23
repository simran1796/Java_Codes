import java.util.*;
class Set1
{
public static void main(String arg[])
{
 Set<Integer>s=new HashSet<Integer>();
 Set<Integer>s1=new HashSet<Integer>();
 s.add(8);
 s.add(2);
 s.add(3);
 s.add(1);
 s.add(2);
 s1.add(1);
 s1.add(5);
 s1.add(9);
 s1.add(2);
 System.out.print(s);
 s.addAll(s1);
 System.out.print(s);
 s.retainAll(s1);
 System.out.print(s);
 s.removeAll(s1)
 System.out.print(s);
}
}