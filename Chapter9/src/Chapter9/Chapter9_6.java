package Chapter9;
//6��
//20���� 10*10 ũ���� JLavel ������Ʈ�� ������ ���� (50, 50)��ġ���� (250, 250)
//���� �������� ������ ��ġ�� ��µǵ��� ���� ���α׷��� �ۼ��϶�.
//�������� ũ�⸦ 300*300���� �ϰ�, JLabel�� ������ ��� �Ķ������� �϶�.
import java.awt.*;
import javax.swing.*;

public class Chapter9_6 extends JFrame {
	Chapter9_6(){
		setTitle("Random Labels");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		for(int i=0;i<20;i++){
			JLabel label = new JLabel();
			int x = (int)(Math.random()*200)+50; // 50~250
			int y = (int)(Math.random()*200)+50; // 50~250
			label.setLocation(x,y); // label�� (x,y)�� ��ġ
			label.setBackground(Color.BLUE);
			label.setSize(10,10); // label ũ�⸦ 10*10���� ����
			c.add(label);
			label.setOpaque(true); // label�� ������ ���̰� ��
		}
		setSize(300,300);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_6();
	}

}