
public class StaticBlock 
{
	static             //static代码块
	{
		System.out.println("22222222");
	}
	{                  //匿名代码块
		System.out.println("11111111");
	}
	public StaticBlock()   //构造函数
	{
		System.out.println("33333333");
	}
	{                   //匿名代码块
		System.out.println("44444444");
	}
}
