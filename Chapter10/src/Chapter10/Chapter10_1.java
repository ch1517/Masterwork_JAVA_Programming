package Chapter10;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//JLabel 컴포넌트는 Mouse 이벤트를 받을 수 있다. JLabel 컴포넌트에 마우스를 올리면
//"Love Java"가, 내리면 "사랑해"가 출력되도록 스윙 응용프로그램을 작성하라.
public class Chapter10_1 extends JFrame{

	Chapter10_1(){
		setTitle("마우스 올리기 내리기 예제"); // 제목 지정
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 시 화면 닫기
		
		JLabel label = new JLabel("Love Java");
		
		// Jabel 컴포넌트 생성 후 MouseListener를 단다.
		label.addMouseListener(new MyMouseAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_1();
	}

}
// MouseAdapter를 상속 받는 MyMouseAdapter 클래스
class MyMouseAdapter extends MouseAdapter{
	public void mouseEntered(MouseEvent e) {
		// 마우스가 label 컴포넌트 위에 올라왔을 때
		JLabel l = (JLabel)e.getSource();
		l.setText("사랑해");
	}
	public void mouseExited(MouseEvent e) {
		// 컴포넌트 위에 올라온 마우스가 컴포넌ㄴ트를 벗어났을 때
		JLabel l = (JLabel)e.getSource();
		l.setText("Love Java");
	}
}
