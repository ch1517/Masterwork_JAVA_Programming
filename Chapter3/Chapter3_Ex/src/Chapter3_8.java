public class Chapter3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp[] = new int[16];
		int array[][]= new int[4][4];
		int num;
		for(int i=0;i<8;i++){
			num = (int)Math.round(Math.random()*15);
			if(tmp[num]==0){
				tmp[num]=(int)Math.round(Math.random()*9+1);
			}
			else{
				i--;
			}
		}
		int k=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				array[i][j]=tmp[k];
				System.out.print(array[i][j]+"\t");
				k++;
			}
			System.out.println();
		}
	}
}
