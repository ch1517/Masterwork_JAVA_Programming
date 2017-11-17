import java.util.Scanner;

public class Chapter2_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if((x>=y+z)||(y>=x+y)||(z>=x+y)){
			System.out.println("만들 수 없다.");
		}
		else{
			System.out.println("만들 수 있다.");
		}
	}

}
