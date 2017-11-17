import java.util.HashMap;
import java.util.Scanner;

class Location{
	String region; // 지역
	String latitude; // 위도 
	String hardness; // 경도
}
public class Chapter7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> area = new HashMap<String, Location>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			Location l = new Location();
			System.out.print("지역명을 입력하시오 : ");
			l.region = sc.next();
			System.out.print("위도를 입력하시오 : ");
			l.latitude = sc.next();
			System.out.print("경도를  입력하시오 : ");
			l.hardness = sc.next();
			System.out.println();
			area.put(l.region, l);
		}
		System.out.print("지역명을 입력하시오 : ");
		Location l = area.get(sc.next());
		System.out.println("지역명 : " + l.region);
		System.out.println("위도 : " + l.latitude);
		System.out.println("경도 : " + l.hardness);
	}

}
