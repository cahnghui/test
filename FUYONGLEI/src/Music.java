class Instrument
{
	public void play()
	{
		System.out.println("Instrument play()");
	}
}
public class Music extends Instrument{
	public void play()
	{
		System.out.println("Music play()");
	}
//	public void func()
//	{
//		super.play();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music i = new Music();
		i.play();
	}
}
