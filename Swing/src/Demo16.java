import java.awt.*;
import javax.swing.*;

public class Demo16 extends JFrame {

    // ��������
    JLabel jl1;

    // �ϲ�����
    JButton jb1, jb2, jb3;
    JPanel jp1;

    // �в�����
    JTabbedPane jtp;// ѡ�����
    JPanel jp2, jp3, jp4;

    JLabel jl2, jl3, jl4, jl5;
    // ���������ı���
    JTextField jtf;
    // ����
    JPasswordField jpf;
    // �������
    JButton jb4;
    // �����¼����ס����
    JCheckBox jcb1, jcb2;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Demo16();

    }

    public Demo16() {

        // �������
        jl2 = new JLabel("QQ����", JLabel.CENTER);
        jl3 = new JLabel("QQ����", JLabel.CENTER);
        jl4 = new JLabel("��������", JLabel.CENTER);
        jl4.setFont(new Font("����", Font.PLAIN, 16));// ����������ʽ
        jl4.setForeground(Color.BLUE);// ����������ɫ
        jl5 = new JLabel("<html><a href='www.qq.com'>�������뱣��</a></html>");
        // ��괥���仯
        jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        jtf = new JTextField();
        jpf = new JPasswordField();
        jb4 = new JButton(new ImageIcon("images\\login.png"));

        jcb1 = new JCheckBox("�����¼");
        jcb2 = new JCheckBox("��ס����");

        // ��������
        jl1 = new JLabel(new ImageIcon("images\\headpicture.jpg"));

        // �ϲ�����
        jp1 = new JPanel();
        jb1 = new JButton(new ImageIcon("images\\login.png"));
        jb2 = new JButton(new ImageIcon("images\\delete.png"));
        jb3 = new JButton(new ImageIcon("images\\register.png"));

        // �в�����
        jtp = new JTabbedPane();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp3.setBackground(Color.RED);// ��������ñ���
        jp4 = new JPanel();
        jp4.setBackground(new Color(0, 0, 255));

        // �������ӵ�ѡ�������
        jtp.add("QQ����", jp2);// ������ѡ����ƣ����
        jtp.add("�ֻ�����", jp3);
        jtp.add("��������", jp4);

        // ���ò���
        jp2.setLayout(new GridLayout(3, 3));

        // ������
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);

        jp2.add(jl2);
        jp2.add(jtf);
        jp2.add(jb4);
        jp2.add(jl3);
        jp2.add(jpf);
        jp2.add(jl4);
        jp2.add(jcb1);
        jp2.add(jcb2);
        jp2.add(jl5);

        this.add(jp1, BorderLayout.SOUTH);
        this.add(jl1, BorderLayout.NORTH);
        this.add(jtp, BorderLayout.CENTER);

        // չʾ���
        ImageIcon icon = new ImageIcon("images\\qq.png");
        this.setIconImage(icon.getImage());// ����������ͼ�귽��
        this.setSize(400, 380);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}