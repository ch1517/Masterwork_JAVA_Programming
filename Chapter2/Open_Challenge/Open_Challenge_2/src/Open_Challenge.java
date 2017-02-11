import java.util.Scanner;

public class Open_Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -1; // x가 2이면 철수 승, 1이면 무승부, 0이면 영희 승
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner sd = new Scanner(System.in);
		System.out.print("철수 >> ");
		String ch = sd.next();
		System.out.print("영희 >> ");
		String young = sd.next();
		if(ch.equals("가위")){
			if(young.equals("가위")){
				x=1;
			} else if(young.equals("바위")){
				x=0;
			} else if(young.equals("보")){
				x=2;
			} else{
				x=-1;
			}
		} else if(ch.equals("바위")){
			if(young.equals("가위")){
				x=2;
			} else if(young.equals("바위")){
				x=1;
			} else if(young.equals("보")){
				x=0;
			} else{
				x=-1;
			}
		} else if(ch.equals("보")){
			if(young.equals("가위")){
				x=0;
			} else if(young.equals("바위")){
				x=2;
			} else if(young.equals("보")){
				x=1;
			} else{
				x=-1;
			}
		} else{
			x=-1;
		}
		if(x==0){
			System.out.println("영희가 이겼습니다.");
		} else if(x==1){
			System.out.println("비겼습니다.");
		} else if(x==2){
			System.out.println("철수가 이겼습니다.");
			System.out.println(x);
		} else{
			
		}
	}
}
