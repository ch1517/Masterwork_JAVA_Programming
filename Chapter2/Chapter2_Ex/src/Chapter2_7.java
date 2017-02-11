import java.util.Scanner;

public class Chapter2_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if(x>=50&&x<=100){
			if(y>=50&&y<=100){
				System.out.println("사각형 안에 점이 있습니다.");
			}
			else
				System.out.println("사각형 밖에 점이 있습니다.");
		}
	}
}
