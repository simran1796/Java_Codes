import java.util.*;
class Vector1
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Vector a=new Vector();
 a.add(1);
 a.add("chitkara");
 a.add(2);
 a.add("Hello");
 System.out.println(a);
 a.add(1,"university");
 System.out.println(a);
 System.out.println(a.get(2));
 a.set(1,"uni");
 System.out.println(a);
 if(a.contains("uni"))
 System.out.println("Yes");
 else
 System.out.println("No");
 System.out.println(a.indexOf("chitkara"));
 a.remove(1);
 System.out.println(a);
}
}