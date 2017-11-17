abstract class MyPoint{
	int x;
	int y;
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show(){
		System.out.println(x+","+y);
	}
}
class MyColorPoint extends MyPoint{
	String color;
	MyColorPoint(int x, int y, String color){
		super(x,y);
		this.color = color;
	}

	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	protected void reverse() {
		// TODO Auto-generated method stub
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	protected void show(){
		System.out.println(x+","+y+","+color);
	}
}
public class Chapter5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p =new MyColorPoint(2,3,"Blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
