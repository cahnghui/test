package test1;

public class B {

	public void show()
	{
//		System.out.println(v1);  //error
//		System.out.println(v2);  //error
//		System.out.println(v3);  //error
//		System.out.println(v4);  //error
//		showV1();  //error
//		showV2();  //error
//		showV3();  //error
//		showV4();  //error
		
		A obj = new A();

//		System.out.println(obj.v1); //error
		System.out.println(obj.v2);
		System.out.println(obj.v3);
		System.out.println(obj.v4);
		
//		obj.showV1();  //error
		obj.showV2();
		obj.showV3();
		obj.showV4();
	}
	public static void main(String[] a)
	{
		B obj = new B();
		obj.show();
	}
}
