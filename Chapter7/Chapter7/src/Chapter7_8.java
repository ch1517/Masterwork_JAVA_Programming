
public class Chapter7_8<E> {
	private E e;
	public Chapter7_8(E e){
		this.e = e;
	}
	void setS(E e){
		this.e = e;
	}
	E getS(){
		return e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter7_8<String> s = new Chapter7_8<String>("Á¤¼öÇö");
		Chapter7_8<Integer> i = new Chapter7_8<Integer>(20153031);
		System.out.println(s.getS());
		System.out.println(i.getS());
		i.setS(20173031);
		System.out.println(i.getS());
	}

}
