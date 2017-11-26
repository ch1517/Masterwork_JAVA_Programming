package Chapter10;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

// JLabel을 활용하여 "Love Java"를 출력하고 왼쪽 화살표 키 (<Left> 키)를 입력할 때 마다
// "avaJ evoL"와 "Love Java"를 번갈아 출력하는 스윙 프로그램을 작성하라.
// StringBuffer 클래스의 reverse() 메소드를 이용하여 구현하는 것과 JLavel에 포커스를 설정하는 것을 잊지 말아야 한다.

public class Chapter10_3 extends JFrame{
	JLabel label; 
	// "Love Java"를 거꾸로 출력하기 위해 StringBuffer 생성
	StringBuffer s = new StringBuffer("Love Java");
	Chapter10_3(){
		setTitle("Left 키로 문자열 바꾸기 예제"); // 제목 지정
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 시 화면 닫기
		
		label= new JLabel("Love Java");
		
		// Jabel 컴포넌트 생성 후 KeyListener를 단다.
		label.addKeyListener(new MyKeyAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_3();
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) { // 입력받은 코드가
				case KeyEvent.VK_LEFT: //<Left> 키 일때
					if(label.getText().equals("Love Java")) { // "Love Java"일 때
						label.setText(s.reverse().toString()); 
						// s.reverse()를 하면 따로 변수에 담지 않아도 s 자체가 바뀜
					}
					else {
						label.setText(s.reverse().toString());
					}
					break;
				default:
					break;
			}
		}
	}

}
