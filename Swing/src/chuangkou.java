import java.awt.Container;
import java.awt.Graphics;
import javax.swing.*;
import javax.imageio.ImageIO;
@SuppressWarnings("unused")
public class chuangkou extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public chuangkou() {
		setTitle("本窗体使用绝对布局");
		setLayout(null);
		setBounds(200,200,800,600);
		setLocationRelativeTo(null);
		Container c=getContentPane();
		JButton b1=new JButton("按钮1");
		JButton b2= new JButton("按钮2");
		b1.setBounds(170,400,80,30);
		b2.setBounds(550,400,80,30);
		c.add(b1);
		c.add(b2);
		ImageIcon ii=new ImageIcon("D:\timg.jpg");
		JLabel jl=new JLabel();
		jl.setIcon(ii);
		this.add(jl);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	static public void main(String args[])
	{
		new chuangkou();
	}
}
