import java.sql.*;
 /**
  * 1:�����ݿ����������
  * @author biexiansheng
  *
  */
public class InsertMysql {
     public static void main(String[] args) {
         try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");//�������ݿ�����
             System.out.println("�������ݿ������ɹ�");
             String url="jdbc:mysql://localhost:3306/student?serverTimezone=GMT";//�������ݿ�test��url
             String user="changhui";//���ݿ���û���
             String password="123456";//���ݿ������
             //�������ݿ����ӣ�������Ӷ���conn(�׳��쳣����)
             Connection conn=DriverManager.getConnection(url, user, password);
             System.out.println("�������ݿ�ɹ�");
             //����һ��mysql���
             String sql="insert into stu(id,name,score) values(2,'xuwenjie',99)";        
             Statement stmt=conn.createStatement();//����һ��Statement����
             stmt.executeUpdate(sql);//ִ��sql���
             System.out.println("���뵽���ݿ�ɹ�");
             conn.close();
             System.out.println("�ر����ݿ�ɹ�");
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