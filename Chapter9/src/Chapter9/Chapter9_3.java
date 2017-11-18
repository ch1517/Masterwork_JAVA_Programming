package Chapter9;
//3번
//GridLayout을 사용하여 다음 그림과 같이 한 줄에 10개의 버튼을 동일한 크기로 배치하는 스윙프로그램을 작성하라.
import java.awt.*;
import javax.swing.*;

public class Chapter9_3 extends JFrame{

	Chapter9_3(){
		setTitle("Ten Buttons Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++){
			c.add(new JButton(i+""));
		}
		setSize(700,300);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_3();
	}

}
