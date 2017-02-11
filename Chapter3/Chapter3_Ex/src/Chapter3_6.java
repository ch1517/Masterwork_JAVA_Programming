import java.util.Scanner;

public class Chapter3_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		Scanner sd = new Scanner(System.in);
		int tmp;
		for(int i=0;i<10;i++){
			array[i]=sd.nextInt();
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					tmp = array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
