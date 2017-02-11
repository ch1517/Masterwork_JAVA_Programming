import java.util.ArrayList;
import java.util.Scanner;

public class Chapter3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(true){
			System.out.print("0보다 큰 수를 입력하시오(종료:-1) : ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			if(num==-1){
				break;
			}
			if(num>0){
				for(int i=0;num>0;i++){
					array.add(num%2);
					num /=2;
				}
				for(int i=array.size()-1;i>=0;i--){
					System.out.print(array.get(i));
				}
			}
			System.out.println();
			array.clear();
			
		}
	}

}
