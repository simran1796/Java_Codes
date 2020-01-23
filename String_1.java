import java.util.Scanner;
class String_1
{
public static void main(String args[])
{
 String s1="CHITKARA UNIVERSITY CHITKARA";
 String s2="PUNJAB";
 System.out.println(s1.length());
 System.out.println(s1.indexOf("KARA"));
 System.out.println(s1.indexOf("KARA",4));
 System.out.println(s1.lastIndexOf('A'));
 System.out.println(s1.concat(s2));
 String a="Punjab";
 String b="punjab";
 System.out.println(a.equals(b));
 System.out.println(a.equalsIgnoreCase(b));
 a=a.replace("Pun","   ");
 System.out.println(a);
 System.out.println(a.trim());
 System.out.println(s1.toLowerCase());
 System.out.println(b.toUpperCase());
}
}