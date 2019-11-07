class Outer4
{
	private int num = 5;
	public void display(final int temp)
	{
		class Inner
		{
			public void fun()
			{
				System.out.println(num);
				System.out.println(temp);
			}
		}
		new Inner().fun();
	}
}
public class FunctionInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer4 out = new Outer4();
		out.display(2);
	}

}
