import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
public class MyDialog extends JDialog{
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public MyDialog()
	{
		setBounds(100,100,250,150);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5,5,5,5));
		getContentPane().add(contentPanel,BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0,0));
		JLabel label = new JLabel("这是一个对话框");
		label.setFont(new Font("微软雅黑",Font.PLAIN,15));
		contentPanel.add(label,BorderLayout.CENTER);
	}
}
