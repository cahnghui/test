import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
//客户端
public class TcpClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			//创建客户端Socket、输入流、输出流
			Socket socket = null;
			ObjectOutputStream os = null;
			ObjectInputStream is = null;
			
			try {
				//连接服务器
				socket = new Socket("localhost",1234);
				//接受输出流中的数据
				os = new ObjectOutputStream(socket.getOutputStream());
				//将字符串写入输出流
				String in = input.nextLine();
				if(in.equals("end")) {
					System.out.println("断开连接");
					try {
						is.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						os.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else {
					os.writeObject(in);
					os.flush();
					//接收输入流中的数据
					is = new ObjectInputStream(socket.getInputStream());
					//读取输入流的数据
					Object obj = is.readObject();
					//如果数据不为空则转换成String类型 然后输出
					if(obj != null) {
						System.out.println((String)obj);
					}
				}	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}