class Rectangle{
	private int x1, y1, x2, y2;
	Rectangle(){
		x1=0;
		y1=0;
		x2=0;
		y2=0;
	}
	Rectangle(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	void set(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	int square(){
		int area = (x2-x1)*(y2-y1);
		if(area<0){
			return -area;
		} else
			return area;
	}
	void show(){
		System.out.println("("+x1+","+y1+")"+","+"("+x2+","+y2+")");
		System.out.println("넓이 : "+ this.square());
	}
	boolean equals(Rectangle r){ // 넓이가 같은가?
		if(this.square() == r.square())
			return true;
		else
			return false;
	}
}
public class Chapter4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s)){
			System.out.println("두 사각형은 넓이가 같습니다.");
		}	
	}
}
