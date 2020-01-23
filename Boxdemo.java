class Box
{
int l,b,h;
void setvalue(int p,int q,int r)
{
 l=p;
 b=q;
 h=r;
}
int vol()
{ return l*b*h;}
}
class Boxdemo
{
public static void main(String args[])
{
 Box b1=new Box();
 b1.setvalue(10,5,2);
 int v=b1.vol();
 System.out.print("Volume of box "+v);
}
}
