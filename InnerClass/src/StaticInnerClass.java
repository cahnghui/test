class Outer3 {
    public String name = "test";
    private static int age =20;

    static class Inner{
        private String name = "nihao";
        public void fun()
        {
            System.out.println(name);
            System.out.println(age);
        }
    }
}
public class StaticInnerClass{
    public static void main(String [] args)
    {
        Outer3.Inner in = new Outer3.Inner();
        in.fun();
    }
}
