import java.util.Scanner;
class Prac
{
public static void main(String args[])
{
 StringBuffer sb=new StringBuffer("THIS IS");
 sb.deleteCharAt(0);
 System.out.println(sb);
 
 System.out.println(sb.substring(1,3));
}
}