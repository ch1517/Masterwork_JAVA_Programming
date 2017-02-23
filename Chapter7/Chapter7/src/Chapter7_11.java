import java.util.Vector;

class MyStack<T>{
	Vector<T> v = new Vector();
	
	void push(T t){
		v.add(t);
	}
	T pop(){
		return v.remove(v.size()-1);
	}
	void display(){
		for(int i=0;i<v.size();i++){
			System.out.print(v.get(i) +" ");
		}
		System.out.println();
	}
}
public class Chapter7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack m = new MyStack();
		m.push(10);
		m.push(20);
		m.push(30);
		m.display();
		m.push(40);
		m.push(50);
		m.display();
		m.pop();
		m.display();
	}

}
