import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JDialog;
class MyDialog1 extends JDialog
{
	private static final long serialVersionUID = 1L;
	public MyDialog1()
	{
		setLayout(null);
		setTitle("���㣬ôô��");
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\���������\\untitled.png");  // ͼƬ�ľ���λ��
		this.setIconImage(icon); 
		int screenWidth = (int) this.getToolkit().getScreenSize().getWidth();
		int screenHeight = (int) this.getToolkit().getScreenSize().getHeight();
		setBounds((screenWidth - 300)/2,(screenHeight - 170)/2,280,170);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		JLabel label = new JLabel();
		label.setBounds(40,17,200,50);
		label.setText("׼���ñ��ҳ�����"); 
		label.setFont(new Font("΢���ź�",Font.PLAIN,15));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		JButton b = new JButton("ȷ��");
		b.setBounds(105,77,70,30);
		add(b);
		b.addMouseListener(new MouseListener() 
		{
			public void mouseEntered(MouseEvent e)
			{
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
public class AbsolutePosition extends JFrame{
	private static final long serialVersionUID = 1L;
	public void setBack()
	{
		((JPanel)this.getContentPane()).setOpaque(false);
		ImageIcon img = new ImageIcon("D:\\���������\\����biu.jpg"); //���ͼƬ
	    JLabel background = new JLabel(img); 
	    this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
	    background.setBounds(370, 35, 255, 255);
	    JButton b2 = new JButton("��ѽ");
	    this.getLayeredPane().add(b2, new Integer(Integer.MIN_VALUE));
		b2.setBounds(440,340, 70, 30);
		JLabel label1 = new JLabel(); // ������ǩ����
		label1.setBounds(80, 60, 200, 50); // ���ñ�ǩ����ʾλ�ü���С
		label1.setText("С���۲���ܾ���"); // ���ñ�ǩ��ʾ����
		label1.setFont(new Font("΢���ź�", Font.PLAIN, 20)); // �������ֵ����弰��С
		label1.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label1, new Integer(Integer.MIN_VALUE));
		JLabel label2 = new JLabel(); // ������ǩ����
		label2.setBounds(80, 210, 200, 50); // ���ñ�ǩ����ʾλ�ü���С
		label2.setText("����Ů���Ѻò���"); // ���ñ�ǩ��ʾ����
		label2.setFont(new Font("΢���ź�", Font.BOLD, 25)); // �������ֵ����弰��С
		label2.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
		JLabel label3 = new JLabel(); // ������ǩ����
		label3.setBounds(80, 110, 200, 50); // ���ñ�ǩ����ʾλ�ü���С
		label3.setText("�Ҽ�ɶ����ȱ"); // ���ñ�ǩ��ʾ����
		label3.setFont(new Font("΢���ź�", Font.PLAIN, 20)); // �������ֵ����弰��С
		label3.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label3, new Integer(Integer.MIN_VALUE));
		JLabel label4 = new JLabel(); // ������ǩ����
		label4.setBounds(80, 160, 200, 50); // ���ñ�ǩ����ʾλ�ü���С
		label4.setText("Ψ�����ڱ���ȱ����"); // ���ñ�ǩ��ʾ����
		label4.setFont(new Font("΢���ź�", Font.PLAIN, 20)); // �������ֵ����弰��С
		label4.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label4, new Integer(Integer.MIN_VALUE));
		b2.addMouseListener(new MouseListener() 
		{
			public void mouseEntered(MouseEvent e)
			{
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				MyDialog1 dialog = new MyDialog1();
				setEnabled(false);
				dialog.setAlwaysOnTop(true); 
				dialog.setVisible(true);
			}

			@Override
			public void mousePressed(MouseEvent e) {
		
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
	}
	public AbsolutePosition()
	{
		this.setUndecorated(true); // ȥ�����ڵ�װ�� 
	    this.getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\���������\\untitled.png");  // ͼƬ�ľ���λ��
		this.setIconImage(icon);   //���ô��ڵ�logo
		this.setTitle("����һλ˧��С���ı��");
		setBack();
		setLayout(null);
		int screenWidth = (int) this.getToolkit().getScreenSize().getWidth();
		int screenHeight = (int) this.getToolkit().getScreenSize().getHeight();
		setBounds((screenWidth - 650)/2,(screenHeight - 450)/2,650,450);
		this.setResizable(false);
		Container c = this.getContentPane();
		
		JPanel jp = new JPanel();
		jp.setOpaque(false); 
		c.add(jp);
		JButton b1 = new JButton("����");
		b1.setBounds(140,315,70,30);
		c.add(b1);
		b1.addMouseListener(new MouseListener() 
		{
			public void mouseEntered(MouseEvent e)
			{
				Random rand = new Random();
				int a = rand.nextInt(580);
				int b = rand.nextInt(390);
				b1.setBounds(a, b, 70, 30);
				c.add(b1);
			}
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}

			@Override
			public void mousePressed(MouseEvent e) 
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    setVisible(true);
//		setAlwaysOnTop(true); 
	    
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	}
	public static void main(String[] args)
	{
		new AbsolutePosition();
	}
}