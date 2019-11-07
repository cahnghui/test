package demo;

public class Boy implements ILookAnother 
{
	private String name;
	private int age;
	
	public Boy(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void LookAnother() {
		// TODO Auto-generated method stub
		System.out.println("你好，我是"+this.name +"我今年"+this.age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
