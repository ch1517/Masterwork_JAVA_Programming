package Chapter8;
//2번
//텍스트 파일을 읽어 소문자로 된 영어 문자를 모두 대문자로 바꿔서 출력하는 프로그램을 버퍼 스트림을 이용하여 작성하라.

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Chapter8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedOutputStream bout = new BufferedOutputStream(System.out,5);
		// 버퍼를 가지는 스트림을 만들기
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\test1.txt");
			// 텍스트 파일을 읽기
			int c;
			while((c=fin.read())!=-1) { // 파일의 끝을 만날 때까지 문자들 하나씩 읽기
				bout.write((char)(c-32)); // 읽은 문자를 버퍼 출력 스트림에 씀
			}
			fin.close();
			bout.close();
		}catch(IOException e) { // 파일이 존재하지 않을 때 예외처리
			System.out.println("test1.txt 파일이 존재하지 않습니다.");
		}
	}

}
