
public class CacheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b1=true;
		Boolean b2=true;
		System.out.println("Boolean Test:"+String.valueOf(b1==b2));
		Byte b3=127;
		Byte b4=127;
		System.out.println("Byte Test:"+String.valueOf(b3==b4));
		Character c1=127;
		Character c2=127;
		System.out.println("Character Test:"+String.valueOf(c1==c2));
		Short s1=-128;
		Short s2=-128;
		System.out.println("Short Test:"+String.valueOf(s1==s2));
		Integer i1=-128;
		Integer i2=-128;
		System.out.println("Integer Test:"+String.valueOf(i1==i2));
		Long l1=1000L;
		Long l2=1000L;
		System.out.println("Long Test:"+String.valueOf(l1==l2));
		Float f1=0.5f;
		Float f2=0.5f;
		System.out.println("Float Test:"+String.valueOf(f1==f2));
		Double d1=0.5;
		Double d2=0.5;
		System.out.println("Double Test:"+String.valueOf(d1==d2));
	}

}
