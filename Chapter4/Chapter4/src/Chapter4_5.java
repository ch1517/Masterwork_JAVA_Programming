import java.util.Scanner;

class Add{
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a+b;
	}
}
class Sub{
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a-b;
	}
}
class Mul{
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a*b;
	}
}
class Div{
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	double calculate(){
		return (double)a/b;
	}
}
public class Chapter4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두 정수와 연산자를 입력하시오>>");
		Scanner sd = new Scanner(System.in);
		int x = sd.nextInt();
		int y =sd.nextInt();
		char ch = sd.next().charAt(0);
		
		switch(ch){
			case '+':
				Add a = new Add();
				a.setValue(x, y);
				System.out.println(a.calculate());
				break;
			case '-':
				Sub s = new Sub();
				s.setValue(x, y);
				System.out.println(s.calculate());
				break;
			case '*':
				Mul m = new Mul();
				m.setValue(x, y);
				System.out.println(m.calculate());
				break;
			case '/':
				Div d = new Div();
				d.setValue(x, y);
				System.out.println(d.calculate());
				break;
		}
		
	}

}
