
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class RunningButton extends JFrame implements ActionListener {
    private JButton btn1, btn2;
    private int dir1 = -1, dir2 = -1; // -1是向左，1是向右
    private static int SPEED = 10; // 固定的速度
    private int speed1 = 0, speed2 = 0; // 可变的速度
     
    public RunningButton() {
        super("按钮快跑");
    }
     
    private void launch() {
        setVisible(true);
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
         
        btn1 = new JButton("按钮1");
        getContentPane().add(btn1);
        btn2 = new JButton("按钮2");
        getContentPane().add(btn2);
         
        btn1.addActionListener(this);
        btn2.addActionListener(this);
         
        setLocationRelativeTo(null);
        new Thread(new ButtonThread()).start();
    }
 
    public static void main(String[] args) {
        new RunningButton().launch();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == btn1 && 0 == speed1) {
            speed1 = SPEED;
        } else if(source == btn2 && 0 == speed2) {
            speed2 = SPEED;
        }
    }
 
    class ButtonThread implements Runnable {
        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(30);
                    btn1Run();
                    btn2Run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
     
    private void btn1Run() {
        if(0 == speed1) {
            btn1.setLocation(btn1.getX(), 300);
            return;
        }
        int speed = dir1 * speed1;
        btn1.setLocation(btn1.getX() + speed, 300);
        if(btn1.getX() <= 0) {
            speed1 = 0;
            dir1 *= -1;
            btn1.setLocation(0, 300);
        } else if(btn1.getX() >= btn2.getX() - btn1.getWidth()) {
            speed1 = 0;
            dir1 *= -1;
            btn1.setLocation(btn2.getX() - btn1.getWidth(), 300);
        }
    }
     
    private void btn2Run() {
        if(0 == speed2) {
            btn2.setLocation(btn2.getX(), 300);
            return;
        }
        int speed = dir2 * speed2;
        btn2.setLocation(btn2.getX() + speed, 300);
        if(btn2.getX() >= getWidth() - btn2.getWidth()) {
            speed2 = 0;
            dir2 *= -1;
            btn2.setLocation(getWidth() - btn2.getWidth(), 300);
        } else if(btn2.getX() <= btn1.getX() + btn1.getWidth()) {
            speed2 = 0;
            dir2 *= -1;
            btn2.setLocation(btn1.getX() + btn1.getWidth(), 300);
        }
    }
}