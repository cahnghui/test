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
		setTitle("爱你，么么扎");
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\浏览器下载\\untitled.png");  // 图片的具体位置
		this.setIconImage(icon); 
		int screenWidth = (int) this.getToolkit().getScreenSize().getWidth();
		int screenHeight = (int) this.getToolkit().getScreenSize().getHeight();
		setBounds((screenWidth - 300)/2,(screenHeight - 170)/2,280,170);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		JLabel label = new JLabel();
		label.setBounds(40,17,200,50);
		label.setText("准备好被我宠上天"); 
		label.setFont(new Font("微软雅黑",Font.PLAIN,15));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		JButton b = new JButton("确定");
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
		ImageIcon img = new ImageIcon("D:\\浏览器下载\\爱你biu.jpg"); //添加图片
	    JLabel background = new JLabel(img); 
	    this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
	    background.setBounds(370, 35, 255, 255);
	    JButton b2 = new JButton("好呀");
	    this.getLayeredPane().add(b2, new Integer(Integer.MIN_VALUE));
		b2.setBounds(440,340, 70, 30);
		JLabel label1 = new JLabel(); // 创建标签对象
		label1.setBounds(80, 60, 200, 50); // 设置标签的显示位置及大小
		label1.setText("小姐姐观察你很久了"); // 设置标签显示文字
		label1.setFont(new Font("微软雅黑", Font.PLAIN, 20)); // 设置文字的字体及大小
		label1.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label1, new Integer(Integer.MIN_VALUE));
		JLabel label2 = new JLabel(); // 创建标签对象
		label2.setBounds(80, 210, 200, 50); // 设置标签的显示位置及大小
		label2.setText("做我女朋友好不好"); // 设置标签显示文字
		label2.setFont(new Font("微软雅黑", Font.BOLD, 25)); // 设置文字的字体及大小
		label2.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
		JLabel label3 = new JLabel(); // 创建标签对象
		label3.setBounds(80, 110, 200, 50); // 设置标签的显示位置及大小
		label3.setText("我家啥都不缺"); // 设置标签显示文字
		label3.setFont(new Font("微软雅黑", Font.PLAIN, 20)); // 设置文字的字体及大小
		label3.setHorizontalAlignment(JLabel.CENTER);
		this.getLayeredPane().add(label3, new Integer(Integer.MIN_VALUE));
		JLabel label4 = new JLabel(); // 创建标签对象
		label4.setBounds(80, 160, 200, 50); // 设置标签的显示位置及大小
		label4.setText("唯独户口本上缺个你"); // 设置标签显示文字
		label4.setFont(new Font("微软雅黑", Font.PLAIN, 20)); // 设置文字的字体及大小
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
		this.setUndecorated(true); // 去掉窗口的装饰 
	    this.getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\浏览器下载\\untitled.png");  // 图片的具体位置
		this.setIconImage(icon);   //设置窗口的logo
		this.setTitle("来自一位帅气小哥哥的表白");
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
		JButton b1 = new JButton("不好");
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