class MyPoint{
	int a;
	int b;
	MyPoint(int x, int y){
		a=x;
		b=y;
	}
	public String toString(){
		return "MyPoint("+a+","+b+")";
	}
}
public class Chapter6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a =new MyPoint(3,20);
		System.out.println(a);
	}

}
