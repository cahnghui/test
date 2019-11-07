
public class Test {
	public static void main(String[] args)  {
		new Coffee(1, 2.5f, true, true);
	}
}

//In source packet in file init/ex16/Liquid.java
class Liquid {
	private int mlVolume;
	private float temperature; // in Celsius
	public Liquid(int mlVolume, float temperature) {
		this.mlVolume = mlVolume;
		this.temperature = temperature;
		method();//如果是从子类调用这个方法，这里的method使用的是子类的方法
	}
	public void method() {
		System.out.println("我在父类");
	}
}

class Coffee extends Liquid {
	private boolean swirling;
	private boolean clockwise;
	public Coffee(int mlVolume, float temperature, boolean swirling, boolean clockwise)  {
		super(mlVolume, temperature);
		this.swirling = swirling;
		if (swirling) {
			this.clockwise = clockwise;
		} 
		System.out.println("success");
	}
	//父类的method被重写了
	public void method() {
		System.out.println(swirling);
	}
}
