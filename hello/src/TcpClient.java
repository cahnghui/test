import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
//�ͻ���
public class TcpClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			//�����ͻ���Socket���������������
			Socket socket = null;
			ObjectOutputStream os = null;
			ObjectInputStream is = null;
			
			try {
				//���ӷ�����
				socket = new Socket("localhost",1234);
				//����������е�����
				os = new ObjectOutputStream(socket.getOutputStream());
				//���ַ���д�������
				String in = input.nextLine();
				if(in.equals("end")) {
					System.out.println("�Ͽ�����");
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
					//�����������е�����
					is = new ObjectInputStream(socket.getInputStream());
					//��ȡ������������
					Object obj = is.readObject();
					//������ݲ�Ϊ����ת����String���� Ȼ�����
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