package demo;

public class Matchman implements ILookAnother{
	private ILookAnother boy;
	private ILookAnother girl;
	

	public ILookAnother getBoy() {
		return boy;
	}
	public void setBoy(ILookAnother boy) {
		this.boy = boy;
	}
	public ILookAnother getGirl() {
		return girl;
	}
	public void setGirl(ILookAnother girl) {
		this.girl = girl;
	}
	@Override
	public void LookAnother() {
		// TODO Auto-generated method stub
		Boy boy = (Boy)this.boy;
		Girl girl = (Girl)this.girl;
		System.out.println("����"+boy.getName()+"����"+girl.getName());
		boy.LookAnother();
		girl.LookAnother();
	}
	
}
