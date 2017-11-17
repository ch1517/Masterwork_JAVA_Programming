class CPoint{
	int a;
	int b;
	String color;
	CPoint(int x, int y){
		a=x;
		b=y;
		color="";
	}
	public String toString(){
		return "("+a+","+b+") 입니다";
	}
	public void show(){
		System.out.println("("+a+","+b+")"+color);
	}
}
class CColorPoint extends CPoint{
	CColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
}
public class Chapter5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPoint a,b;
		
		a = new CPoint(2,3);
		b = new CColorPoint(3,4,"red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}

}
