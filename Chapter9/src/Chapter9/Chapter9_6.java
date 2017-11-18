package Chapter9;
//6번
//20개의 10*10 크기의 JLavel 컴포넌트가 프레임 내의 (50, 50)위치에서 (250, 250)
//내의 영역에서 랜덤한 위치에 출력되도록 스윙 프로그램을 작성하라.
//프레임의 크기를 300*300으로 하고, JLabel의 배경색은 모두 파란색으로 하라.
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
			label.setLocation(x,y); // label을 (x,y)에 배치
			label.setBackground(Color.BLUE);
			label.setSize(10,10); // label 크기를 10*10으로 설정
			c.add(label);
			label.setOpaque(true); // label에 배경색이 보이게 함
		}
		setSize(300,300);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_6();
	}

}
