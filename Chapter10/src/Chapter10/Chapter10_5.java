package Chapter10;
//JLabel 컴포넌트는 Key 이벤트를 받을 수 있다. JLabel 컴포넌트를 이용하여 "Love Java"를
//출력하고 + 키를 치면 폰트 크기를 5픽셀씩 키우고, -키를 치면 폰트 크기를 5픽셀씩 줄이는 스윙 응용프로그램을 작성하라.
//5픽셀 이하로 작아지지 않도록하라.

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Chapter10_5 extends JFrame {
	JLabel label; 
	Chapter10_5(){
		setTitle("+,- 키로 폰트 크기 조절"); // 제목 지정
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 시 화면 닫기
		
		label= new JLabel("Love Java");
		label.setSize(200,50);
		label.setFont(new Font("Arial",Font.PLAIN,10));
		// Arial 폰트로 10픽셀 크기
		
		label.addKeyListener(new MyKeyAdapter());
		// Jabel 컴포넌트 생성 후 KeyListener를 단다.
		
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_5();
		
	}

	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			Font f = label.getFont();
			int size = f.getSize(); // label의 font size 구하기
			
			switch(e.getKeyCode()) {
				case 45: // -키 눌렀을 경우
					if(size>5) { // 5보다 클때만
						label.setFont(new Font("Arial", Font.PLAIN,size-5));
					}
					break;
				case 61: // +나=키 놀렀을 경우
					label.setFont(new Font("Arial", Font.PLAIN,size+5));
					break;
			}
		}
	}
}
