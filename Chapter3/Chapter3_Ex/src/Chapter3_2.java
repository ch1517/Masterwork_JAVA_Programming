import java.util.Scanner;

public class Chapter3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("알파벳 한 문자를 입력하시오>>");
		Scanner sd = new Scanner(System.in);
		char a = sd.next().charAt(0);
		
		int x = a-'a'+1;
		
		for(int i=0;i<x;i++){
			int k=0;
			for(int j=x-i;j>0;j--){
				System.out.print((char)('a'+k));
				k++;
			}
			System.out.println();
		}
	}

}
