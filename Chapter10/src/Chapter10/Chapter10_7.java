package Chapter10;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


//JLavel을 활용하여 "Lobe Java"를 출력하고, "Love Java" 글자 위에 마우스를 올려 마우스 휠을 위로 굴리면 글자가 작아지고,
//아래로 굴리면 글자가 커지도록 프로그램을 작성하라. 폰트 크기는 한 번에 5픽셀씩 작아지거나 커지도록 하고, 5픽셀 이하로 작아지지않도록 하라.

public class Chapter10_7 extends JFrame{
	JLabel label; 
	Chapter10_7(){
		setTitle("마우스 휠을 굴려 폰트 크기 수정 응용프로그램"); // 제목 지정
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 시 화면 닫기
		
		label= new JLabel("Love Java");
		label.setSize(200,50);
		label.setFont(new Font("Arial",Font.PLAIN,10));
		// Arial 폰트로 10픽셀 크기
		
		label.addMouseWheelListener(new MyMouseWheelListener());
		// Jabel 컴포넌트 생성 후 MouseListener를 단다.
		
		add(label);
		setSize(400,200);
		setVisible(true);
		label.requestFocus();
		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_7();
	}
	
	class MyMouseWheelListener implements MouseWheelListener{
		Font f;
		int size; // label의 font size 구하기
		int n;
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			f = label.getFont();
			size =f.getSize();
			n = e.getWheelRotation();
			if(n<0&&size>5) // up direction. 폰트 5픽셀 작게
				label.setFont(new Font("Arial", Font.PLAIN,size-5));
			else // down direction. 폰트 5픽셀 크게
				label.setFont(new Font("Arial", Font.PLAIN,size+5));
		}
		
	}

}
