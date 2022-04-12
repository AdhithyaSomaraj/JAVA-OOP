class Rectangle
{
 double length,breadth;
void SetData(double l,double b)
{
length=l;
breadth=b;
}
double getArea()
{
double area;
area=length*breadth;
return area;
}
}
class Rect
{
public static void main(String args[])
{
double a;
Rectangle R1=new Rectangle();
R1.SetData(10.5,15);
a=R1.getArea();
System.out.println("Area of rectangle R="+a);
}
}


