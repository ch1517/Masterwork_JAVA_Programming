import java.util.Scanner;

public class Chapter2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int monney = s.nextInt();
		
		System.out.println("오만 원권 : " + monney/50000 + "매");
		System.out.println("만 원권 : " + monney%50000/10000 + "매");
		System.out.println("천 원권 : " + monney%10000/1000 + "매");
		System.out.println("500원 짜리 동전 : " + monney%1000/500 + "개");
		System.out.println("100원 짜리 동전 : " + monney%500/100 + "개");
		System.out.println("50원 짜리 동전 : " + monney%100/50 + "개");
		System.out.println("10원 짜리 동전 : " + monney%50/10 + "개");
		
	}

}
