public class string 
{
	public static void main(String[] args) 
	{
		String str1 = "E:\\\\w文章\\\\";
		String str2 = "java\\\\jsp\\\\include\\\\test.txt";
		String str = str1.concat(str2);
		System.out.println("完整字符串为："+str);
		System.out.println("完整字符串的长度为："+str.length());
		System.out.println("“\\”在完整字符串最后出现的位置为："+str.lastIndexOf('\\'));
		System.out.println(str.substring(29, 37));
		String[] str3 = "test.txt".split("\\.");
		System.out.println(str3[1]);
	}
}
