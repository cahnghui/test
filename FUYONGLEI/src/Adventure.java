interface CanFight
{
	void fight();
}
interface CanSwim
{
	void swim();
}
interface CanFly
{
	void fly();
}
class ActionCharacter
{
	public void fight()
	{
		System.out.println("I can fight");
	}
}
class Hero extends ActionCharacter implements CanFight
{
//	public void swim()
//	{
//		System.out.println("I can Swim");
//	}
//	public void fly()
//	{
//		System.out.println("I can fly");
//	}
//	public void fight()
//	{
//		System.out.println("I can fight");
//	}
}
public class Adventure {

	public static void t(CanFight x)
	{
		x.fight();
	}
	public static void u(CanSwim x)
	{
		x.swim();
	}
	public static void v(CanFly x)
	{
		x.fly();
	}
	public static void w(ActionCharacter x)
	{
		x.fight();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero();
		t(h);
		w(h);
	}

}
