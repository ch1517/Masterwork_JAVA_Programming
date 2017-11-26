package Chapter10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//컨텐트팬의 배경색은 초록색으로 하고 마우스를 드래깅하는 동안만 노란색으로 유지하는 스윙 응용 프로그램을 작성하라.
public class Chapter10_2 extends JFrame{
	JPanel contentPane = new JPanel(); // 컨텐트팬으로 사용할 패널
	Chapter10_2(){
		setTitle("드래깅동안 YELLO"); // 제목 지정
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 닫기 버튼을 눌렀을 시 화면 닫기
		
		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN);
		// JPanel에 MouseMotionListener 추가
		contentPane.addMouseMotionListener(new MyMouseMotionAdapter());
		// JPanel에 MouseListener 추가
		contentPane.addMouseListener(new MyMouseAdapter2());
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter10_2();
	}
	//MouseMotionAdapter를 상속 받는 MyMouseMotionAdapter 클래스
	class MyMouseMotionAdapter extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			// 마우스가 드래그되는 동안
			contentPane.setBackground(Color.YELLOW);
		}
	}
	//MouseAdapter를 상속 받는 MyMouseAdapter2 클래스
	class MyMouseAdapter2 extends MouseAdapter{
		public void mouseReleased(MouseEvent e) {
			// 눌러진 마우스 버튼이 떼어질 때
			contentPane.setBackground(Color.GREEN);
		}
	}
}