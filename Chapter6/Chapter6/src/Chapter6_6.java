import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		int count=0;
		try {
			while(true) {
				int c = rd.read(); // ctrl-z가 안먹혀서 Enter로 변경
				if(c==13) // Enter 입력시 종료
					break;
				if((char)c>='A'&&(char)c<='Z') {
					count++;
				}
			}
			System.out.println(count);
		} catch(IOException e) {
			System.out.println("입력 오류 발생");
		}
	}

}
