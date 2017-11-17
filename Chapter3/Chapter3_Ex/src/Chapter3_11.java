import java.util.Scanner;

public class Chapter3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		while(true){
			System.out.print("금액을 입력하시오(나가기:-1) : ");
			Scanner sd = new Scanner(System.in);
			int money = sd.nextInt();
			if(money==-1){
				break;
			}
			System.out.println("오만 원 : "+ money/50000);
			System.out.println("만 원 : " + (money%50000)/10000);
			System.out.println("천 원 : " + (money%10000)/1000);
			System.out.println("500원 : " + (money%1000)/500);
			System.out.println("100원 : " + (money%500)/100);
			System.out.println("50원 : " + (money%100)/50);
			System.out.println("10원 : " + (money%50)/10);
		}
	}
}
