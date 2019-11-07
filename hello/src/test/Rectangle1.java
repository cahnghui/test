package test;

import java.util.Scanner;

public class Rectangle1 {
	
	private double length;
	private double width;
	public Rectangle1() {}
	public Rectangle1(double length,double width)
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长和宽：");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		while(length*width<=0)
		{
			System.out.println("请重新输入：");
			length = sc.nextDouble();
			width = sc.nextDouble();
		}
		Rectangle rectangle = new Rectangle(length,width);
		rectangle.area();
	}
}
