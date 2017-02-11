import java.util.Random;
import java.util.Scanner;

public class Open_Challenge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		Random r = new Random();
		int k = r.nextInt(100);
		int maxnum = 99;
		int minnum = 0;
		int count = 1;
		while(true){
			Scanner sd = new Scanner(System.in);
			System.out.println(minnum+"-"+maxnum);
			System.out.print(count+">>");
			int usernum = sd.nextInt();
			if(usernum < k){
				minnum = usernum;
				System.out.println("더 높게");
			} else if (usernum > k){
				maxnum = usernum;
				System.out.println("더 낮게");
			} else{
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까?(y/n)>>"); //다시풀기....
				char replay = sd.next().charAt(0);
				if(replay == 'n'){
					break;
				} else if(replay == 'y'){
					maxnum = 99;
					minnum = 0;
					count = 1;
					k = r.nextInt(100);
					System.out.println("수를 결정하였습니다. 맞추어 보세요");
					continue;
				} else {
					
				}
			}
			
		}
		count++;
		
	}
}
