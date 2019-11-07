import java.sql.*;
 /**
  * 1:向数据库中添加数据
  * @author biexiansheng
  *
  */
public class InsertMysql {
     public static void main(String[] args) {
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");//加载数据库驱动
             System.out.println("加载数据库驱动成功");
             String url="jdbc:mysql://localhost:3306/student?serverTimezone=GMT";//声明数据库test的url
             String user="changhui";//数据库的用户名
             String password="123456";//数据库的密码
             //建立数据库连接，获得连接对象conn(抛出异常即可)
             Connection conn=DriverManager.getConnection(url, user, password);
             System.out.println("连接数据库成功");
             //生成一条mysql语句
             String sql="insert into stu(id,name,score) values(2,'xuwenjie',99)";        
             Statement stmt=conn.createStatement();//创建一个Statement对象
             stmt.executeUpdate(sql);//执行sql语句
             System.out.println("插入到数据库成功");
             conn.close();
             System.out.println("关闭数据库成功");
         } catch (ClassNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }//
         catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         
     }     
 }