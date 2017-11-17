package Chapter8;
//7번
//이미지 파일 a.jpg를 b.jpg로 복사하는 프로그램을 작성하라.
//한 번에 1kB 단위로 데이터를 복사하라.
//a.jpg는 프로젝트 폴더 밑에 있어야 한다.

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null; // 바이트 스트림 생성
		FileOutputStream fout =null;
		try {
			fin = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\a.jpg");
			fout = new FileOutputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\b.jpg");
			int c;
			while((c = fin.read())!=-1) {
				fout.write(c); // 파일 복사하기
			}
			fin.close();
			fout.close();
			// 스트림 닫기
		} catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
