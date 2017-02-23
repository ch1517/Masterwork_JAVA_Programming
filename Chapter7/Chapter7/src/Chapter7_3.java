import java.util.HashMap;
import java.util.Scanner;

public class Chapter7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++){
			nations.put(sc.next(), sc.nextInt());
		}
		System.out.print("나라 이름을 입력해주세요 : ");
		String country = sc.next();
		System.out.println(nations.get(country));
		
	}

}
