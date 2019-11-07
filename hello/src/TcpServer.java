
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//��������
public class TcpServer {
	public static void main(String[] args) throws IOException {
		//����10000�ӿ�
		ServerSocket server = new ServerSocket(1234);
		while(true) {
			//���տͻ��˵�����
			Socket socket = server.accept();
			//���ÿͻ��˵����ݴ�����
			invoke(socket);
		}
	}

	private static void invoke(final Socket socket) throws IOException {
		// TODO Auto-generated method stub
		//����һ�����߳�
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//��������������
				ObjectInputStream is = null;
				//�������������
				ObjectOutputStream os = null;
				try {
					is = new ObjectInputStream(socket.getInputStream());
					os = new ObjectOutputStream(socket.getOutputStream());
					//��ȡһ������
					Object obj = is.readObject();
					//������ת��ΪString
					
					//�ڷ����������
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
