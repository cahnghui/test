class Outer1{
    private String outStr ="Outer�е��ַ���";
    public String getOutStr()
    {
        return outStr;
    }
    public void fun(){  //2
        //this��ʾ��ǰ����
        Inner in = new Inner(this); //3
        in.print();                 //5
    }
}
class Inner{
    private String inStr= "Inner�е��ַ���";
    private Outer1 out;
    //����ע��
    public Inner(Outer1 out)  //3
    {
        this.out=out;       //4.ΪInner�е�out������ʼ��
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
