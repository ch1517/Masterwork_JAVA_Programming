
public class Chapter3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[4][4];
		int num;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				num=(int)Math.round(Math.random()*9+1);
				array[i][j]=num;
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
