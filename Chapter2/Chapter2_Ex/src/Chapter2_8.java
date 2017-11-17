import java.util.Scanner;

public class Chapter2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 (x1, y1), (x2, y2)의 좌표를 입력하시오>>");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
		if((x1>=50&&x1<=100)&&(y1>=50&&y1<=100)){
			System.out.println("사각형이 겹칩니다.");
		}
		else if((x2>=50&&x2<=100)&&(y2>=50&&y2<=100)){
			System.out.println("사각형이 겹칩니다.");
		}
		else{
			System.out.println("사각형이 겹치지 않습니다.");
		}
	}

}
