package Chapter8;
//1번
//a.jpg 파일의 크기를 화면에 출력하는 프로그램을 작성하라. 
//파일의 크기는 File 클래스의 length() 메소드를 이용하면 된다.
//a.jpg는 프로젝트 폴더 밑에 있어야 한다.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Chapter8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\a.jpg");
		// a.jpg가 저장되어 있는 경로
		if(f.exists()) { // 파일이 존재할때 파일의 크기 출력
			System.out.println(f.length());
		} else { // 파일이 존재하지 않을 때 예외처리
			System.out.println("a.jpg 파일이 없습니다.");
		}
	}

}
