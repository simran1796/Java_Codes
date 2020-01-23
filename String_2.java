import java.util.Scanner;
class String_2
{
public static void main(String args[])
{
 String a,b;
 Scanner sc=new Scanner(System.in);
 a=sc.next();
 b=sc.next();
 char[] c=a.toCharArray();
 char[] d=b.toCharArray();
 int m=a.length();
 int n=b.length();
 int co=0;
 int dd=0;
 int p,q;
 if(m!=n)
 System.out.println("Strings are not convertable");
 else
 {
 for(int i=0;i<m;i++)
 {
  if(c[i]=='a'||c[i]=='i'||c[i]=='o'||c[i]=='e'||c[i]=='u')
  co++;
 }
 for(p=0,q=0;p<m&&q<n;p++,q++)
 {
  if(c[p]=='a'||c[p]=='i'||c[p]=='o'||c[p]=='e'||c[p]=='u')
  {
   if(d[q]=='a'||d[q]=='i'||d[q]=='o'||d[q]=='e'||d[q]=='u')
   {
    if(p==q)
    dd++;
   }
  }
 }
 if(co==dd)
 System.out.println("Strings are convertable");
 else
 System.out.println("Strings are not convertable");
 }
}
}