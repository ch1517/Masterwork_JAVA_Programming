import java.lang.reflect.Array;

interface Stack{
	int length();
	Object pop();
	boolean push(Object ob);
}
class StringStack implements Stack{
	Object stack;
	StringStack(){
		stack="";
	}
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return stack.toString().length(); // Stack의 길이 출력
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return stack;
	}

	@Override
	public boolean push(Object ob) {
		// TODO Auto-generated method stub
		if(ob.equals("")){
			return false;
		} else{
			stack=ob;
			return true;		
		}
	}
	
}
public class Chapter5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringStack st = new StringStack();
		st.push("안녕하세요!");
		System.out.println(st.length());
		System.out.println(st.pop());
	}

}
