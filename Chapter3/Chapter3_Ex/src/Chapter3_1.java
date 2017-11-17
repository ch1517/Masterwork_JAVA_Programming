import java.util.Scanner;

public class Chapter3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("임의의 정수를 입력하시오>>");
		Scanner sd = new Scanner(System.in);
		int num = sd.nextInt();
		for(int i=0;i<num;i++){
			for(int j=num-i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
