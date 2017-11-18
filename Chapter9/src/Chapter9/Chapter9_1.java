package Chapter9;
import javax.swing.*;
//1번
//다음 그림과 같이 "Let`s study Java"라는 문자열을 타이틀로 가지고 프레임의 크기가 400*200인 스윙 프로그램을 작성하라.
public class Chapter9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("Let`s study Java");
		f.setSize(400, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
