package test;
import java.util.Scanner;

class Circle       //圆形类继承形状类
{
	private double r;
	private static final double PI=3.14;
	public Circle() {}
	public Circle(double r)
	{
		this.r = r;
	}
	public double area()              //实现接口的抽象方法
	{
		System.out.println("area of circle is:");
		System.out.println(PI*r*r);
        return PI*r*r;
	}
}

class Rectangle      //矩形类继承形状类
{
	private double length;
	private double width;
	public Rectangle() {}
	public Rectangle(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	public double area()                //实现接口的抽象方法
	{
		System.out.println("area of rectangle is:");
		System.out.println(length*width);
		return length*width;
	}
}


public class ShapeTest                   //主类
{          
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a radius:");
		double r = in.nextDouble();
		while(r<=0)
		{
			System.out.println("重新输入：");
			r = in.nextDouble();
		}
		Circle c = new Circle(r);
		System.out.println("Please input length and width:");
        double length = in.nextDouble();
		double width = in.nextDouble(); 
		while(length*width<=0)
		{
			System.out.println("重新输入：");
			length = in.nextDouble();
			width = in.nextDouble(); 
		}
		Rectangle rec = new Rectangle(length,width);
		
		System.out.println("他们的面积和为："+c.area()+rec.area());

		            
	}
}
