package demo;

public class Demo {
	public static void main(String[] args) {
		Boy boy = new Boy("����",18);
		Girl girl = new Girl("����",19);
		Matchman man = new Matchman();
		man.setBoy(boy);
		man.setGirl(girl);
		man.LookAnother();
	}
}
