class Outer2
{
	private String name = "test";
	public static int age = 20;
	class Inner
	{
		public int num = 10;
		public void fun()
		{
			System.out.println(name);
			System.out.println(age);
		}
	}
}
public class ChengYuanInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2.Inner in = new Outer2().new Inner();
		in.fun();
	}
}
