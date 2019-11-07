
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//服务器端
public class TcpServer {
	public static void main(String[] args) throws IOException {
		//监听10000接口
		ServerSocket server = new ServerSocket(1234);
		while(true) {
			//接收客户端的链接
			Socket socket = server.accept();
			//调用客户端的数据处理方法
			invoke(socket);
		}
	}

	private static void invoke(final Socket socket) throws IOException {
		// TODO Auto-generated method stub
		//开启一个新线程
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//创建输入流对象
				ObjectInputStream is = null;
				//创建输出流对象
				ObjectOutputStream os = null;
				try {
					is = new ObjectInputStream(socket.getInputStream());
					os = new ObjectOutputStream(socket.getOutputStream());
					//读取一个对象
					Object obj = is.readObject();
					//将对象转化为String
					
					//在服务器端输出
					System.out.println((String)obj);
					
					os.writeObject(obj);
					os.flush();
				}catch(IOException | ClassNotFoundException ex) {
					ex.printStackTrace();
				}finally {
					try{
						is.close();
						os.close();
						socket.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}
}
