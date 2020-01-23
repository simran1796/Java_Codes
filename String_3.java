class String_3
{
public static void main(String args[])
{
 StringBuilder sb=new StringBuilder();
 sb.append("ABC");
 System.out.println(sb);
 sb.append("EFG");
 System.out.println(sb);
 StringBuilder s=new StringBuilder(5);
 s.append("XYZ");
 System.out.println(s);
 StringBuilder sbs=new StringBuilder("UVW");
 sbs.append("XYZ");
 System.out.println(sbs);
 String s1="lmn";
 StringBuilder ss=new StringBuilder(s1);
 ss.append("op");
 System.out.println(ss);
}
}