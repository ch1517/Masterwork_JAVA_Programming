import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

abstract class DObject{
	abstract void draw();
}
class Line extends DObject{

	@Override
	void draw() { // static, private, final로 선언된 메소드는 오버라이딩될 수 없다.
		// TODO Auto-generated method stub
		System.out.println("Line");
	}
	
}
class Rect extends DObject{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}
	
}
class Circle extends DObject{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}
public class Chapter5_6 {
	
	public static void insert(ArrayList<DObject> d){
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
		Scanner sd = new Scanner(System.in);
		int ch = sd.nextInt();
		switch(ch){
			case 1:
				d.add(new Line());
				break;
			case 2:
				d.add(new Rect());
				break;
			case 3:
				d.add(new Circle());
				break;
		}
	}
	
	public static void delete(ArrayList<DObject> d){
		System.out.print("삭제할 도형의 위치>>");
		Scanner sd = new Scanner(System.in);
		int ch = sd.nextInt();
		if(ch>=0&&ch<d.size()){
			d.remove(ch);
		} else {
			System.out.println("삭제할 수 없습니다.");
		}
	}
	public static void print(ArrayList<DObject> d){
		for(int i=0;i<d.size();i++){
			d.get(i).draw();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<DObject> list= new ArrayList<DObject>();
		while(true){
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			Scanner sd = new Scanner(System.in);
			int ch = sd.nextInt();
			switch(ch){
				case 1: // 링크드 리스트로 도형 생성하여 연결하기
					insert(list);
					break;
				case 2:
					delete(list);
					break;
				case 3:
					print(list);
					break;
			}
			if(ch==4){
				break;
			}
		}
		
	
	}
	

}
