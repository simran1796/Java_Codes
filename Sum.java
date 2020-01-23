import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,d,sum=0;
n=s.nextInt();
while(n!=0)
{
 d=n%10;
 n=n/10;
 sum=sum+d;
}
System.out.print(sum);
}
}