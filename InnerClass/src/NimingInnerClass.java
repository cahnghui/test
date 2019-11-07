interface MyInterface
{
	public void test();
}
class Outer5
{
	private int num = 5;
	public void display(int temp)
	{
		new MyInterface()
		{
			public void test()
			{
				System.out.println("匿名实现MyInterface接口");
				System.out.println(temp);
			}
		}.test();
	}
}
public class NimingInnerClass 
{
	public static void main(String[] args)
	{
		Outer5 out = new Outer5();
		out.display(3);
	}
}
