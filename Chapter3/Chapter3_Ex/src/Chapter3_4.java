import java.util.Scanner;

public class Chapter3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sd = new Scanner(System.in);
		int x = sd.nextInt();
		int y = sd.nextInt();
		int tmp;
		if(y==maxNum(x,y)){
			tmp=x;
			x=y;
			y=tmp;
		}
		tmp=x%y;
		while(tmp>0){
			x=y;
			y=tmp;
			tmp=x%y;
		}
		System.out.println(y);
		
	}
	public static int maxNum (int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}

}
