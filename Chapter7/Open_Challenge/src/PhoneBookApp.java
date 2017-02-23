import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class Phone{
	private String callNumber;
	private String name;
	private String adress;
	String getCallNumber(){
		return callNumber;
	}
	String getName(){
		return name;
	}
	String getAdress(){
		return adress;
	}
	void setCallNumber(String callNumber){
		this.callNumber=callNumber;
	}
	void setName(String name){
		this.name=name;
	}
	void setAdress(String adress){
		this.adress=adress;
	}
}
public class PhoneBookApp {
	static Phone p = null;
	static HashMap<String, Phone> map = new HashMap<String,Phone>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
		System.out.println("--------------------------------------------------");
		while(true){
			System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4>>");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch){
				case 0:
					addPhone();
					break;
				case 1:
					deletePhone();
					break;
				case 2:
					selectPhone();
					break;
				case 3:
					printPhone();
					break;
			}
			if(ch == 4){
				break;
			}
		}
	}
	static void addPhone(){
		Scanner sc = new Scanner(System.in);
		p = new Phone();
		System.out.print("이름>>");
		String name= sc.next();
		if(map.get(name)!=null){
			System.out.println(name+"은 이미 등록되어 있는 사람입니다.");
		}else{
			p.setName(name);
			System.out.print("주소>>");
			p.setAdress(sc.next());
			System.out.print("전화번호>>");
			p.setCallNumber(sc.next());
			map.put(name, p);
		}
	}
	static void selectPhone(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름>>");
		String name = sc.next();
		if(map.get(name)==null){
			System.out.println(name+"는 등록되지 않은 사람입니다.");
		} else {
			Phone uphone = map.get(name);
			System.out.println(uphone.getName()+"\t"+uphone.getAdress()+"\t"+uphone.getCallNumber());
		}
	}
	static void deletePhone(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름>>");
		String name = sc.next();
		if(map.get(name)==null){
			System.out.println(name+"는 등록되지 않은 사람입니다.");
		} else {
			map.remove(name);
			System.out.println(name+"은 삭제되었습니다.");
		}
		
	}
	static void printPhone(){
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		for(int i=0;i<keys.size();i++){
			String key = it.next();
			Phone uphone = map.get(key);
			System.out.println(uphone.getName()+"\t"+uphone.getAdress()+"\t"+uphone.getCallNumber());
			
		}
	}
}
