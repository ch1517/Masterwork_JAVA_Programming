package Chapter9;
//4번
//문제 3을 수정하여 다음 결과와 같이 각 버튼의 배경색을 서로 다르게 설정하라.
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Chapter9_4 extends JFrame{
	Color colorArr[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.blue,new Color(330066), new Color(660066), Color.DARK_GRAY,
			Color.pink, Color.GRAY }; 
	Chapter9_4(){
		setTitle("Ten Color Buttons Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i=0;i<10;i++){
			JButton btn = new JButton(i+"");
			btn.setBackground(colorArr[i]);
			c.add(btn);
		}
		setSize(700,300);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Chapter9_4();
	}
}
