class Outer1{
    private String outStr ="Outer中的字符串";
    public String getOutStr()
    {
        return outStr;
    }
    public void fun(){  //2
        //this表示当前对象
        Inner in = new Inner(this); //3
        in.print();                 //5
    }
}
class Inner{
    private String inStr= "Inner中的字符串";
    private Outer1 out;
    //构造注入
    public Inner(Outer1 out)  //3
    {
        this.out=out;       //4.为Inner中的out变量初始化
    }
    public void print(){    //6
        System.out.println(out.getOutStr()); //7
    }
} 
public class Test2{
    public static void main(String[] args)
    {
        Outer1 out = new Outer1();  //1.
        out.fun(); //2.
    }
}
