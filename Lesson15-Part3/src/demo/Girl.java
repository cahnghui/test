package demo;

public class Girl implements ILookAnother{
	private String name;
	private int age;
	public Girl(String name,int age)
	{
		this.age = age;
		this.name = name;
	}
	@Override
	public void LookAnother() {
		// TODO Auto-generated method stub
		System.out.println("��ã�����"+this.name +"�ҽ���"+this.age);
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
