import java.sql.*;
public class MysqlTestDemo {
public static void main(String[] args) {
//����Connection����
Connection con;
//����������
String driver="com.mysql.cj.jdbc.Driver";
//Urlָ��Ҫ���ʵ����ݿ���mydata
String url="jdbc:mysql://localhost:3306/student?serverTimezone=GMT";
//Mysql����ʱ���û���
String username="changhui";
//Mysql����ʱ������,��������������õ��ǿ�
String password="123456";
//������ѯ�����
try {
//������������
Class.forName(driver);
//���ȣ�getConnection��������������MySQL���ݿ�
con = DriverManager.getConnection(url,username,password);
if(!con.isClosed())
System.out.println("��ϲ��ɹ��������ݿ⣡");
//Ȼ�󴴽�statement���������ִ��SQL���
Statement statement=con.createStatement();
//��Ҫִ�е�Sql���
String sql="select name,score from stu";
//�������Resultset�࣬������Ż�ȡ�Ľ����
ResultSet rs=statement.executeQuery(sql);
System.out.println("ִ�н�����£�");
System.out.println("����"+"\t"+"����");
String name=null;
String score=null;
while(rs.next()) {
//��ȡemp��name����
name=rs.getString("name");
//��ȡemp��job����
score=rs.getString("score");
System.out.println(name+"\t"+score);
}
//���ر�
rs.close();
con.close();
}catch(ClassNotFoundException e) {
//���ݿ��������쳣����
System.out.println("Sorry,can't find the Driver!");
e.printStackTrace();
}catch(SQLException e) {
//���ݿ�����ʧ���쳣����
e.printStackTrace();
}catch(Exception e) {
e.printStackTrace();
}finally {
System.out.println("��ϲ�㣬���ݿ����ݻ�ȡ�ɹ�!!!");
}
}
}