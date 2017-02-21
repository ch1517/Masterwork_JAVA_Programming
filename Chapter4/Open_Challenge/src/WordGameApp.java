import java.util.ArrayList;
import java.util.Scanner;

class Player{
	String name;
	String word;
	void sayWord(){
		System.out.print(name+">>");
		Scanner sc = new Scanner(System.in);
		word = sc.next(); // 사용자로부터 단어를 입력받는다.
	}
	void setName(String name){
		this.name = name;
	}
	void setWord(String word){
		this.word = word;
	}
	String getWord(){
		return word;
	}
	String getName(){
		return name;
	}
	boolean succeed(char lastChar){
		return (this.word.charAt(0) == lastChar);
		// 전 플레이어의 마지막 글자와 다음 플레이어의 첫 번째 글자가 같으면 true 반환
	}
}
public class WordGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> player = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		Player p;
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int playerNum = sc.nextInt();
		for(int i=0;i<playerNum;i++){
			System.out.print("참가자의 이름을 입력하세요>>");
			p=new Player();
			p.setName(sc.next());
			player.add(p); // 사용자가 입력한 단어를 이름으로 설정
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		int i = 0;
		int j, k;
		int lastIndex;
		while(true){
			j=i%playerNum;
			System.out.print(player.get(j).getName()+">>");
			player.get(j).setWord(sc.next());// 사용자가 입력한 단어를 플레이어 단어로 설정
			if(i==0){ 
				if(!player.get(j).succeed('지')){
					System.out.println(player.get(j).getName()+"이 졌습니다.");
					break; // 지로 시작하는 단어인지 확인
				}
			} 
			else{
				k=(i-1)%playerNum; // 플레이어 수에 따른 게임 횟수
				lastIndex = player.get(k).getWord().length()-1; // 마지막 문자에 대한 인덱스
				if(!player.get(j).succeed(player.get(k).getWord().charAt(lastIndex))){
					System.out.println(player.get(j).getName()+"이 졌습니다.");
					break;				
				}
			}
			i++;
		}
	}

}
