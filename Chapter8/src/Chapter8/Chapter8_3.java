package Chapter8;
//3번
//C:\의 서브 디렉터리를 모두 출력하는 프로그램을 작성하라.

import java.io.File;

public class Chapter8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\"); // 경로 입력
		for(String s: f.list()) { // f 경로에 있는 파일과 디렉터리 이름의 리스트 얻기
			File sf = new File(f,s); // f는 parent, s는 child 경로명
			if(sf.isDirectory()) { // sf가 디렉토리 이면
				System.out.println(sf); // sf 출력
			}
		}
		
	}

}
