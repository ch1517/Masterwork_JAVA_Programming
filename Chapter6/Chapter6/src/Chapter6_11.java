import java.awt.print.Printable;
import java.util.Scanner;

public class Chapter6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		int comnum;
		Scanner sd = new Scanner(System.in);
		int usernum;
		while(true){
			System.out.print("가위(1), 바위(2), 보(3)를 입력하시오 : ");
			usernum = sd.nextInt();
			d = Math.random()*2;
			comnum = (int)Math.round(d) + 1; // 1에서 3까지 랜덤 수 생성
			System.out.println(comnum);
			printrpc(comnum,usernum);
			System.out.print("다시하시겠습니까(y/n) : ");
			if(sd.next().charAt(0)=='y'){
				continue;
			} else if(sd.next().charAt(0)=='n'){
				break;
			} else{
	
			}
		}
	}
	static void printrpc(int com, int user){
		if(com == user){
			System.out.println("비겼습니다.");
		} else {
			if(com==3 && user==1){
				System.out.println("이겼습니다.");
			} else if(com==1 && user==3){
				System.out.println("졌습니다.");
			} else{
				if(com>user){
					System.out.println("졌습니다.");
				}else{
					System.out.println("이겼습니다.");
				}
			}
		}
	}

}
