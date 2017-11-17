import java.util.Scanner;

public class Chapter2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str;
		int year = s.nextInt();
		if(year%4==0){
			if(year%100==0){
				if(year%400 ==0){
					str="윤년";
				}
				else{
					str="평년";
				}
			}
			else{
				str="윤년";
			}
		}
		else{
			str="평년";
		}
	System.out.println(str);
	}
}
