import java.util.Scanner;

public class Chapter2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int number;
		int first;
		int last;
		while(true){
			System.out.print("1~99 사이의 정수를 입력하시오(종료:-1)>> ");
			number = a.nextInt();
			first = number/10;
			last = number%10;
			if(number==-1) // -1 입력시 종료
				break;
			if(first%3==0 || last%3==0){ // 둘 중 하나가 3의 배수 일 경우 
				if(first%3==0 && last%3==0) // 둘 다 3의 배수 일 경우 
					System.out.println("박수짝짝");
				else
					System.out.println("박수짝");
			}
		}
	}

}
