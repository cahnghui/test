class Outer{
    private String str ="�ⲿ���е��ַ���";
    //************************** 
    //����һ���ڲ���
    class Inner{
        private String inStr = "�ڲ����е��ַ���";
        //����һ����ͨ����
        public void print(){
            //�����ⲿ���str����
            System.out.println(str);
        }
    }
    //************************** 
    //���ⲿ���ж���һ���������÷�����������ڲ�����󲢵���print()����
    public void fun(){
        //�ڲ������
        Inner in = new Inner();
        //�ڲ�������ṩ��print
        in.print();
    }
}
public class Test1{
    public static void main(String[] args)
    {
        //�����ⲿ�����
        Outer out = new Outer();
        //�ⲿ�෽��
        out.fun();
    }
}
