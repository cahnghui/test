public class string 
{
	public static void main(String[] args) 
	{
		String str1 = "E:\\\\w����\\\\";
		String str2 = "java\\\\jsp\\\\include\\\\test.txt";
		String str = str1.concat(str2);
		System.out.println("�����ַ���Ϊ��"+str);
		System.out.println("�����ַ����ĳ���Ϊ��"+str.length());
		System.out.println("��\\���������ַ��������ֵ�λ��Ϊ��"+str.lastIndexOf('\\'));
		System.out.println(str.substring(29, 37));
		String[] str3 = "test.txt".split("\\.");
		System.out.println(str3[1]);
	}
}
