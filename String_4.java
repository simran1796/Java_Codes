class String_4
{
public static void main(String args[])
{
 StringBuilder sb=new  StringBuilder();
 sb.append("ABCDEFGHIJK");
 System.out.println(sb.capacity());
 System.out.println(sb.charAt(5));
 System.out.println(sb.delete(1,3));
 System.out.println(sb.replace(1,3,"UVWXY"));
 System.out.println(sb.reverse());
 System.out.println(sb.indexOf("U"));
 System.out.println(sb.length());
 String s=sb.toString();
 System.out.println(s); 
}
}