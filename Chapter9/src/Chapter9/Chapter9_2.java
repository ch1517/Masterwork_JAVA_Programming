package Chapter9;
//2번
//BorderLayout을 사용하여 컴포넌트 사이의 수평 간격이 5픽셀, 
//수직 간격이 7픽셀이 되도록 다음 그림과 같은 스윙 응용프로그램을 작성하라.

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Chapter9_2 extends JFrame{
	public Chapter9_2(){
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7)); // ContentPane에 BorderLayout 배치관리자 지정
		
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		setSize(600,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_2();
	}
}
