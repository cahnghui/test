package extend;

public class Detergent1 extends Cleanser
{
	public void scrub()
	{
		append("Detergent1.scrub()");
		super.scrub();
	}
	public void foam()
	{
		append("foam()");
	}
	public static void main(String[] args)
	{
		Detergent1 x = new Detergent1();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class");
		Cleanser.main(args);
	}
}