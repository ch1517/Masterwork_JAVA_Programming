import java.util.Scanner;

// interface를 사용하지 못하는 이유 : 멤버 변수가 상수여야해서 변경 불가
abstract class calc { 
	int a;
	int b;
	abstract void setValue(int x, int y);
	abstract int calculate();
	
}
class Add extends calc{

	@Override
	void setValue(int x, int y) {
		// TODO Auto-generated method stub
		a=x;
		b=y;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a+b;
	}

}
class Sub extends calc{

	@Override
	void setValue(int x, int y) {
		// TODO Auto-generated method stub
		a=x;
		b=y;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
class Mul extends calc{

	@Override
	void setValue(int x, int y) {
		// TODO Auto-generated method stub
		a=x;
		b=y;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
class Div extends calc{

	@Override
	void setValue(int x, int y) {
		// TODO Auto-generated method stub
		a=x;
		b=y;
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
public class Chapter5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두 정수와 연사자를 입력하시오>>");
		Scanner sd = new Scanner(System.in);
		int x = sd.nextInt();
		int y = sd.nextInt();
		char ch = sd.next().charAt(0);
		int result = 0;
		switch (ch){
			case '+':
				Add a = new Add();
				a.setValue(x, y);
				result = a.calculate();
				break;
			case '-':
				Sub s = new Sub();
				s.setValue(x, y);
				result = s.calculate();
				break;
			case '*':
				Mul m = new Mul();
				m.setValue(x, y);
				result = m.calculate();
				break;
			case '/':
				Div d = new Div();
				d.setValue(x, y);
				result = d.calculate();
				break;
		}
		System.out.println(result);
	}

}


