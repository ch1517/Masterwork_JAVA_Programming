package Chapter8;
//5번
//사용자로부터 두 개의 파일 이름을 입력받고 두 파일의 내용을 비교하여 같으면 "파일이 같습니다."를,
//틀리면 "파일이 서로 다릅니다."를 출력하는 프로그램을 작성하라.
//비교 대상인 파일은 텍스트 및 바이너리 파일 모두를 포함한다.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Chapter8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileInputStream f1 = null;
		FileInputStream f2 = null;
		int same = 0; // 같은 파일인지 다른 파일인지 구분하는 변수
		try {
			int a,b;
			f1 = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\"+s.next());
			f2 = new FileInputStream("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Chapter8\\"+s.next());
			// 파일과 연결된 바이트 스트림 생성 (확장자까지 입력)
			if(f1.available()!=f2.available()) { // 파일의 길이가 다르면
				same=0; // 두 파일은 같지 않다.
			} else{
				same=1; // 파일의 길이가 같을 때 두 파일이 같다고 가정하고 while를 돌리면
				while((a = f1.read())!=-1){ // a가 파일의 끝을 만날때까지
					b = f2.read(); // b를 읽어들임
					if(a!=b) { // 중간에 한글자라도 다르면
						same=0; // 두 파일은 같지 않다.
						break; // while문 멈춤
					}
				}
			}
			if(same==1) {
				System.out.println("파일이 같습니다.");
			} else {
				System.out.println("파일이 다릅니다.");
			}
			// 출력 구문
			f1.close();
			f2.close();
			// 스트림 닫기
		} catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
