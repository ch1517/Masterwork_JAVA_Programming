package Chapter8;
//4번
//사용자로부터 두 개의 텍스트 파일 이름을 입력받고 첫 번째 파일 뒤에 두 번째 파일을 덧붙여 새로운 파일을 생성하는 프로그램을 작성하여라.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Chapter8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileReader f1 = null; // 첫번 째 파일
		FileReader f2 = null; // 두번 째 파일
		FileWriter f3 = null; // 첫번 째 파일+ 두번 째 파일
		try {
			int c;
			f1 = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\"+s.next()+".txt");
			f2 = new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\"+s.next()+".txt");
			// 불러올 파일 이름을 입력받음
			f3 = new FileWriter("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\test3.txt");
			// 새로 만들 파일을 설정해줌
			while((c = f1.read())!=-1) { // f1의 내용을 f3에 담는다.
				f3.write(c);
			}
			while((c = f2.read())!=-1) { // f2의 내용을 f3에 담는다.
				f3.write(c);
			}
			f1.close();
			f2.close();
			f3.close();
			// 스트림 닫기
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
