interface Game
{
	void func();
}
interface GameFactory
{
	public Game getGame();
}
class Yingbi implements Game
{
	public void func()
	{
		System.out.println("Å×Ó²±Ò");
	}
	public static GameFactory gameFactory()
	{
		return new GameFactory()
		{
			public Game getGame()
			{
				return new Yingbi();
			}
		};
	}
}
class Shaizi implements Game
{
	public void func()
	{
		System.out.println("ÖÀÉ¸×Ó");
	}
	public static GameFactory gameFactory()
	{
		return new GameFactory()
		{
			public Game getGame()
			{
				return new Shaizi();
			}
		};
	}
}
public class FactoryExample {

	public static void GameService(GameFactory fact)
	{
		Game g = fact.getGame();
		g.func();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameService(Yingbi.gameFactory());
		GameService(Shaizi.gameFactory());
	}

}
