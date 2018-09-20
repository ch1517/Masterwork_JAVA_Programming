import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		int count=0;
		String arr = "";
		try {
			while(true) {
				int c = rd.read(); // ctrl-z가 안먹혀서 Enter로 변경
				if(c==13) // Enter 입력시 종료
					break;
				arr = arr + String.valueOf((char)c); //문자 추가
				count++;
			}
		} catch(IOException e) {
			System.out.println("입력 오류 발생");
		}
		String str[] = arr.split(" "); // 공백 단위로 끊어서 배열에 저장
		int max=str[0].length(); // 최대 문자 길이를 저장할 변수
		int n = 0; //최대 길이 문자가 들어있는 배열의 인덱스
		for(int i=0;i<str.length;i++) {
			if(max<str[i].length()) {
				max=str[i].length();
				n=i;
			}
		}
		System.out.println(str[n]);
	}
}
