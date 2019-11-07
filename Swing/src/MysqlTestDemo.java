import java.sql.*;
public class MysqlTestDemo {
public static void main(String[] args) {
//声明Connection对象
Connection con;
//驱动程序名
String driver="com.mysql.cj.jdbc.Driver";
//Url指向要访问的数据库名mydata
String url="jdbc:mysql://localhost:3306/student?serverTimezone=GMT";
//Mysql配置时的用户名
String username="changhui";
//Mysql配置时的密码,这里的密码我设置的是空
String password="123456";
//遍历查询结果集
try {
//加载驱动程序
Class.forName(driver);
//首先，getConnection（）方法，连接MySQL数据库
con = DriverManager.getConnection(url,username,password);
if(!con.isClosed())
System.out.println("恭喜你成功连接数据库！");
//然后创建statement类对象，用来执行SQL语句
Statement statement=con.createStatement();
//你要执行的Sql语句
String sql="select name,score from stu";
//最后设置Resultset类，用来存放获取的结果集
ResultSet rs=statement.executeQuery(sql);
System.out.println("执行结果如下：");
System.out.println("姓名"+"\t"+"分数");
String name=null;
String score=null;
while(rs.next()) {
//获取emp的name数据
name=rs.getString("name");
//获取emp的job数据
score=rs.getString("score");
System.out.println(name+"\t"+score);
}
//最后关闭
rs.close();
con.close();
}catch(ClassNotFoundException e) {
//数据库驱动类异常处理
System.out.println("Sorry,can't find the Driver!");
e.printStackTrace();
}catch(SQLException e) {
//数据库连接失败异常处理
e.printStackTrace();
}catch(Exception e) {
e.printStackTrace();
}finally {
System.out.println("恭喜你，数据库数据获取成功!!!");
}
}
}