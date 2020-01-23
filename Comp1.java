import java.util.*;
class Emp implements Comparable<Emp>
{
String nm;
int id;
int salary;
int age;
public Emp(String n,int i,int s,int a)
{
nm=n;                      
id=i;
salary=s;
age=a;
}
public int getId(){return this.id;}
public String toString()
{return "Name:"+nm+"\nId:"+id+"\nSalary:"+salary+"\nAge:"+age;}
public int compareTo(Emp e)
{return this.getId()-e.getId();}
}
class Comp1
{
public static void main(String args[])
{
List<Emp>emp_d=new ArrayList<>();
Emp o1=new Emp("Abc",10,10000,30);
Emp o2=new Emp("EFG",20,20000,40);
Emp o3=new Emp("EFG",15,20000,40);
emp_d.add(o1);
emp_d.add(o2);
emp_d.add(o3);
Collections.sort(emp_d);
System.out.println(emp_d);
}
}