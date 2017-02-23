class Circle{
	int x;
	int y;
	int radius;
	public Circle(int x, int y, int radius) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public boolean equals(Circle obj) {
		return this.radius == obj.radius;
	}
}
public class Chapter6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1, 1, 2);
		Circle c2 = new Circle(3, 2, 3);
		Circle c3 = new Circle(4, 6, 2);
		if(c1.equals(c2)){
			System.out.println("c1과 c2는 같다.");
		} else {
			System.out.println("c1과 c2는 다르다.");
		}
		if(c1.equals(c3)){
			System.out.println("c1과 c3는 같다.");
		} else {
			System.out.println("c1과 c3는 다르다.");
		}
	}

}
