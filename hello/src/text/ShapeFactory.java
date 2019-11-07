package text;

import java.util.Scanner;

interface Shape
{
	public void show();
}
class Circle implements Shape
{
	public void show()
	{
		System.out.println("This is a Circle");
	}
}
class Rectangle implements Shape
{
	public void show()
	{
		System.out.println("This is a Rectangle");
	}
}
class Ellipse implements Shape
{
	public void show()
	{
		System.out.println("This is a Ellipse");
	}
}
public class ShapeFactory
{
	public static Shape createShape(char type)
	{
		if(type=='c')
		{
			return new Circle();
		}
		else if(type=='r')
		{
			return new Rectangle();
		}
		else 
		{
			return new Ellipse();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = str.charAt(0);
		Shape sh = createShape(ch);
		sh.show();
	}
}

