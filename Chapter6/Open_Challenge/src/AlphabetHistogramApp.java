import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetHistogramApp {
	static int alphabet[] = null;
	final static int alphabetNum = 26;
	AlphabetHistogramApp(){
		alphabet = new int[alphabetNum];
		for(int i=0;i<alphabetNum;i++){
			alphabet[i]=0; // 알파벳 개수 모두 0으로 초기화
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AlphabetHistogramApp();
		InputStreamReader rd = new InputStreamReader(System.in);
		int index; // 배열에 접근 할 인덱스
		try{
			while(true){
				int c = rd.read(); // enter가 입력되면 13을 리턴한다.
				if(c==13) //c는 입력된 키 값
					break;
				if(Character.isAlphabetic(c)){ // 알파벳인지 확인
					if(c>='a'&&c<='z'){
						c-=32;
					}
					index = c-'A';
					alphabet[index]+=1;
				}
				
			}
			System.out.println("히스토그램을 그립니다.");
			for(int i=0;i<alphabetNum;i++){
				System.out.print((char)(i+'A'));
				for(int j=0;j<alphabet[i];j++)
					System.out.print("-"); // 알파벳 개수만큼 출력
				System.out.println();
			}
		}
		catch(IOException e){
			System.out.println("입력 오류 발생");
		}
	}

}
