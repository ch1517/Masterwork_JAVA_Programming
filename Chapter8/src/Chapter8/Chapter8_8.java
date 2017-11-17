package Chapter8;
//8번
//이미지 파일 a.jpg를 b.jpg로 복사하는 프로그램을 작성하라.
//복사를 진행하는 동안 10% 진행할 때마다 '*' 하나씩 출력하도록 하라.

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null; // 바이트 스트림 생성
		FileOutputStream fout =null;
		try {
			fin = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\a.jpg");
			fout = new FileOutputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\b.jpg");
			int c;
			int total = fin.available(); // 전체 개수
			int count=0; // 현재 개수
			while((c = fin.read())!=-1) { // 파일의 끝을 만날 때 까지
				if(count==total/10) { // 10% 진행 됐을때 
					System.out.print("*");
					count=0; // 현재 진행율을 초기화
				}
				fout.write(c); // 파일 복사하기
				count++;
			}
			fin.close();
			fout.close();
			// 스트림 닫기
		} catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
