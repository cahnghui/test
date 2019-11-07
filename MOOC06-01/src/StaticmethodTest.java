
public class StaticmethodTest {
	int a=111111;
	static int b=222222;
	public static void hello()
	{
		System.out.println("000000");
		System.out.println(b);
		//System.out.println(a);  //error,cannot call non-static variables
		//hi();                   //error,cannot call non-static method
	}
	public void hi()
	{
		System.out.println("333333");
		hello();
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] a) 
	{
		StaticmethodTest.hello();
		//StaticmethodTest.hi();     //error,不能使用类名来引用非静态方法
		StaticmethodTest foo = new StaticmethodTest();
		foo.hello();
		foo.hi();
	}
}
