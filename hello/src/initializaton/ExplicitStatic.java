package initializaton;

class Cup
{
	Cup(int marker)
	{
		System.out.println("Cup("+marker+")");
	}
	void f(int marker)
	{
		System.out.println("f("+marker+")");
	}
}
class Cups
{
	 static Cup cup1;
	static Cup cup2 = new Cup(2);
	static
	{
		cup1 = new Cup(1);
//		cup2 = new Cup(2);
		System.out.println("Hello");
	}
	Cups()
	{
		System.out.println("Cups()");
	}
}
public class ExplicitStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main()");
		Cups.cup2.f(99);
	}
//	static Cups cups1 = new Cups();
//	static Cups cups2 = new Cups();

}
