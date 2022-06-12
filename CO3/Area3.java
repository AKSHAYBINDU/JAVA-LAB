import java.util.*;
class Area3
{
void calculateArea(float x)
{
System.out.println("area of square:"+x*x+" sq units");
}
void calculateArea(float x,float y)
{
System.out.println("area of rectangle:"+x*y+" sq units");
}
void calculateArea(double r)
{
double area=3.14*r*r;
System.out.println("area of circle:"+area+" sq units");
}
public static void main(String args[])
{
int s;
float l,b;
double r;
Area3 obj=new Area3();
Scanner sc=new Scanner(System.in);
System.out.println("enter");
s=sc.nextInt();
System.out.println("enter the l and b");
l=sc.nextFloat();
b=sc.nextFloat();
System.out.println("enter radius");
r=sc.nextDouble();
obj.calculateArea(s);
obj.calculateArea(l,b);
obj.calculateArea(r);
}
}