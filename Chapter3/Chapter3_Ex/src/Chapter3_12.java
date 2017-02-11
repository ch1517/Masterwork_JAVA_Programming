
public class Chapter3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int first;
		int second;
		while(i<100){
			first=i/10;
			second=i%10;
			if((first%3==0&&first!=0) || second%3==0){
				System.out.print(i+ " 박수 ");
				if((first%3==0&&first!=0) && second%3==0)
					System.out.println("두번");
				else
					System.out.println("한번");
				
			}
			i++;
		}
	}

}
