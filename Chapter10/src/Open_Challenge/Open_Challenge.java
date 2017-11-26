package Open_Challenge;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

//스윙으로 간단한 갬블링 게임을 만들어보자. 아래 그림과 같이 3개의 레이블 컴포넌트가 있다.
//이 컴포넌트에는 각각 0~4까지의 한자리 수가 출력된다. <Enger> 키를 입력할 때마다 3개의 수를 랜덤하게 발생시키고 이 수를 각 레이블에 출력한다.
//그러고 나서 모두 동일한 수인지 판단하여 모두 동일한 수이면 "축하합니다!!"를, 아니면 "아쉽군요"를 출력한다.

public class Open_Challenge extends JFrame{
	JLabel first,second,third, sameText;
	Open_Challenge(){
		setTitle("Open Challenge 10"); // 제목 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		
		
		setLayout(null); // 배치관리자 없음
		addKeyListener(new MyKeyAdapter());
		
		first = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
		second = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
		third = new JLabel((int)(Math.random()*5)+"",SwingConstants.CENTER);
		sameText = new JLabel("시작합니다.",SwingConstants.CENTER);
		
		first.setBackground(Color.PINK);
		first.setSize(100,50);
		first.setLocation(40,80);
		first.setFont(new Font("Arial",Font.PLAIN,30));
		first.setOpaque(true);
		
		second.setBackground(Color.PINK);
		second.setSize(100,50);
		second.setLocation(180,80);
		second.setFont(new Font("Arial",Font.PLAIN,30));
		second.setOpaque(true);
		
		third.setBackground(Color.PINK);
		third.setSize(100,50);
		third.setLocation(320,80);
		third.setFont(new Font("Arial",Font.PLAIN,30));
		third.setOpaque(true);
		
		sameText.setSize(300,50);
		sameText.setLocation(80,150);
		
		
		add(first);
		add(second);
		add(third);
		add(sameText);
		
		setVisible(true);
		requestFocus();
		// 포커스 설정
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Open_Challenge();
	}
	
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar() == '\n') {
				first.setText((int)(Math.random()*5)+"");
				second.setText((int)(Math.random()*5)+"");
				third.setText((int)(Math.random()*5)+"");
				if(first.getText().equals(second.getText())) {
					if(second.getText().equals(third.getText()))
						sameText.setText("축하합니다.");
					else
						sameText.setText("아쉽군요");
				}
				else
					sameText.setText("아쉽군요");
			
						
			}
		}
	}
	
}

