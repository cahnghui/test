package exception;
class MyException extends Exception
{
	public MyException() {}
	public MyException(String msg)
	{
		super(msg);
	}
}
public class FullConstructors 
{
	public static void f() throws Exception
	{
		System.out.println("Throwing Exception from f()");
     	System.out.println(5/0);
//		throw new Exception();
	}
	public static void g() throws MyException
	{
		System.out.println("Throwing MyException from g()");
		throw new MyException("fvfdvb");
	}
	public static void main(String[] args)
	{
		try
		{
			f();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			g();
		}
		catch(MyException e)
		{
			e.printStackTrace(System.out);
		}
	}
}
