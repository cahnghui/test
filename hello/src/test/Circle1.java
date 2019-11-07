package test;

import java.util.Scanner;

public class Circle1 
{

		private static final double PI=3.14;
		private double r;
		public Circle1() {}
		public Circle1(double r)
		{
			this.r = r;
		}
		public void area()              
		{
			System.out.println("area of circle is:");
			System.out.println(PI*r*r);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入半径：");
			double r = sc.nextDouble();
			while(r<=0)
			{
				System.out.println("重新输入：");
				r = sc.nextDouble();
			}
			Circle1 cir = new Circle1(r);
			cir.area();
		}
}

