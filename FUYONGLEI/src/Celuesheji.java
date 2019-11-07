import java.util.Arrays;

interface Base
{
	String name();
	Object process(Object input);
}
 class Processor implements Base
{
	public String name()
	{
		return getClass().getSimpleName();
	}
	public Object process(Object input)
	{
		return input;
	}
}
class Upcase extends Processor
{
	public String process(Object input)
	{
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor
{
	public String process(Object input)
	{
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor
{
	public String process(Object input)
	{
		return Arrays.toString(((String)input).split(" "));
	}
}
public class Celuesheji 
{
	public static void process(Base b,Object s)
	{
		System.out.println("Using Processor " + b.name());
		System.out.println(b.process(s));
	}
	public static final String s = "UIHUmodMKMvkfdvb";
	public static void main(String[] args)
	{
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}
}
