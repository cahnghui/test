import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class MyFrame1 extends JFrame
{
	private static final long serialVersionUID = 25345L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try
				{
					MyFrame1 frame = new MyFrame1();
					frame.setVisible(true);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	public MyFrame1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,250,250,150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50,50,50,50));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		JButton button = new JButton("µ¯³ö¶Ô»°¿ò");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				MyDialog dialog = new MyDialog();
				dialog.setVisible(true);
			}
		});
		button.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,15));
		contentPane.add(button);
	}
}
