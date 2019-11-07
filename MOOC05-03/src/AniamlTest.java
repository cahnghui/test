
public class AniamlTest {
	public static void havelunch(Animal a)
	{
		a.eat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] as = new Animal[4];
		as[0] = new Cat();
		as[1] = new Dog();
		as[2] = new Cat();
		as[3] = new Dog();
		for(int i=0;i<as.length;i++)
		{
			as[i].move();
		}
		for(int i=0;i<as.length;i++)
		{
			havelunch(as[i]);
		}
		havelunch(new Cat());
		havelunch(new Dog());
		havelunch(
				   new Animal() 
				   {
					   public void eat()
					   {
						   System.out.println("I can eat from an anonymous class");
					   }
					   public void move()
					   {
						   System.out.println("I can move from an anonymous class");
					   }
		           });
	}

}
