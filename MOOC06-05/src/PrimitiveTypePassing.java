
public class PrimitiveTypePassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println(a);
		changeValue(a);
		System.out.println(a);
		
		a=5;
		int b=6;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void changeValue(int a)
	{
		a = 10;
	}
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a=b;
	}
}
