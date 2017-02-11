import java.util.Scanner;

public class Chapter2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char str;
		while(true){
			System.out.print("영문자 한 자를 입력하시오(종료 : -1) : ");
			str = s.next().charAt(0); // char 형으로 입력 받는 방
			if(str==-1){
				break;
			}
			if(str>='A' && str<='Z'){
				str+=32;
			}
			else if(str>='a' && str<='z'){
				str-=32;
			}
			else{
				System.out.println("영문자가 아닙니다.");
				break;
			}
			System.out.println(str);
		}
	}

}
