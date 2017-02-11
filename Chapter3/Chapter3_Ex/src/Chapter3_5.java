import java.util.ArrayList;
import java.util.Scanner;

public class Chapter3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sd = new Scanner(System.in);
		for(int i=0;i<10;i++){
			array.add(sd.nextInt());
		}
		for(int i=0;i<array.size();i++){
			if(array.get(i)%3==0){
				System.out.print(array.get(i)+" ");
			}
		}
	}

}
