package Chapter8;
//6번
//자바 소스 파일을 읽어들여서 맨 앞에 행 번호를 붙여서 화면에 출력하는 프로그램을 작성하여라.

import java.io.FileReader;
import java.io.IOException;

public class Chapter8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8_5.java");
			// 텍스트 파일을 읽기
			int c;
			int count=1; // 행 번호
			while((c=fin.read())!=-1) { // 파일의 끝을 만날 때까지 문자들 하나씩 읽기
				if(count==1){ // 파일을 시작할 때 행 번호 출력
					System.out.print(count++ + " ");
					continue;
				}
				System.out.print((char)c); // 읽은 문자를 버퍼 출력 스트림에 씀
				if(c=='\n') { // 이후에 공백 문자 마다 행 번호 출력
					System.out.print(count++ + " ");
				}
				
			}
		} catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
