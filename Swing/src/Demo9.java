import java.awt.*;
import javax.swing.*;

public class Demo9 extends JFrame {
    // �������
    int size = 9;
    JButton jbs[] = new JButton[size];

    public static void main(String[] args) {
        // ����ʵ��
        Demo9 de = new Demo9();
    }

    // ���캯��
    public Demo9() {

        // �������
//        for (int i = 0; i < size; i++) {
//            jbs[i] = new JButton(String.valueOf(i));
//        }
//        // �������񲼾�,����ֻ��ǰ������������/�У�3��3 �Ļ�������û�п�϶
//        this.setLayout(new GridLayout(3, 3, 10, 10));
//
//        // ������
//        for (int i = 0; i < size; i++) {
//            this.add(jbs[i]);
//        }
        // ���ô�������
//        this.setTitle("���񲼾ְ���");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 200);

        // ��ʾ
        this.setVisible(true);
    }
}