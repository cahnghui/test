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
	public double area()                //ʵ�ֽӿڵĳ��󷽷�
	{
		System.out.println("area of rectangle is:");
		System.out.println(length*width);
		return length*width;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����볤�Ϳ�");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		while(length*width<=0)
		{
			System.out.println("���������룺");
			length = sc.nextDouble();
			width = sc.nextDouble();
		}
		Rectangle rectangle = new Rectangle(length,width);
		rectangle.area();
	}
}
