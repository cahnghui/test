package thinkingofjava;

import java.util.concurrent.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
//		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				label.setText("Hey! This is Different");
			}
		});
	}
}
