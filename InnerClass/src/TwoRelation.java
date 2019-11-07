class Outer6
{
	private String msg;
	private int age;
	class Inner
	{
		public void display()
		{
			msg = "test";
			age = 20;
			System.out.println(msg);
			System.out.println(age);
		}
	}
	public void test()
	{
		Inner in = new Inner();
		in.display();
	}
}
public class TwoRelation 
{
	public static void main(String[] args) 
	{
		Outer6 out = new Outer6();
		out.test();
	}
}
