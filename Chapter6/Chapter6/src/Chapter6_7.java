import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chapter6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		int count=0;
		char arr[]= new char[100];
		try {
			while(true) {
				int c = rd.read(); // ctrl-z가 안먹혀서 Enter로 변경
				if(c==13) // Enter 입력시 종료
					break;
				arr[count]=(char)c;
				count++;
			}
		} catch(IOException e) {
			System.out.println("입력 오류 발생");
		}
		String s = String.valueOf(arr); // char배열을 String으로 변환
		StringTokenizer st = new StringTokenizer(s, " "); // Tokenizer를 이용해 분리
		System.out.println(st.countTokens()); // Token 개수 출력
	}

}
