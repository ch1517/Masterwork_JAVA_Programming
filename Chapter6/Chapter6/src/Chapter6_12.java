import java.util.Scanner;

class Person{
	private String player1;
	private String player2;
	Person(){
		player1 = "1p";
		player2 = "2p";
	}
	void setName(String p1, String p2){
		player1 = p1;
		player2 = p2;
	}
	String getPlayer1Name(){
		return player1;
	}
	String getPlayer2Name(){
		return player2;
	}
	
}
public class Chapter6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1, d2, d3;
		int num1, num2, num3;
		Scanner sd = new Scanner(System.in);
		System.out.print("1p 이름 입력 : ");
		String player1 = sd.nextLine();
		System.out.print("2p 이름 입력 : ");
		String player2 = sd.nextLine();
		Person person = new Person();
		person.setName(player1,player2);
		int i=0;
		while(true){
			if(i%2 == 0){
				System.out.println(person.getPlayer1Name()+"님 차례");
			} else {
				System.out.println(person.getPlayer2Name()+"님 차례");
			}
			System.out.print("<<Enter입력>>");
			if(sd.nextLine().equals("")){
				d1 = Math.random()*2;
				num1 = (int)Math.round(d1) + 1; // 1에서 3까지 랜덤 수 생성
				d2 = Math.random()*2;
				num2 = (int)Math.round(d2) + 1;
				d3 = Math.random()*2;
				num3 = (int)Math.round(d3) + 1; 
				System.out.print(num1+" "+num2+" "+num3);
				System.out.println();
				i++;
				if(num1 == num2 && num2 == num3){
					if(i%2 == 0){
						System.out.println(person.getPlayer1Name()+"님 Win");
					} else {
						System.out.println(person.getPlayer1Name()+"님 Win");
					}
					break;
				}
			}
		}
	}

}
