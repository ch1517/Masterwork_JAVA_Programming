class Printer{
	private String model_name;
	private String manufacturer;
	private boolean interface_type; // true이면 USB false이면 병렬 인터페이스
	private int quantity_paper = 0;
	private int residual_paper = 10;
	Printer(){
		model_name = "ML-1641K";
		manufacturer = "samsung";
		interface_type = true; 
		quantity_paper = 0;
		residual_paper = 10;
	}
	Printer(String model, String manu, boolean type){
		model_name = model;
		manufacturer = manu;
		interface_type = type;
		quantity_paper = 0;
		residual_paper = 10;
	}
	void print(){
		System.out.println("모델명 : "+ model_name);
		System.out.println("제조사 : "+ manufacturer);
		if(interface_type == true){
			System.out.println("인터페이스 종류 : USB");
		} else {
			System.out.println("인터페이스 종류 : 병렬 인터페이스");
		}
		System.out.println("인쇄 매수 : "+ ++quantity_paper);
		System.out.println("인쇄 종이 잔량 : "+ --residual_paper);
	}
}
class InkjetPrinter extends Printer{
	int residual_ink;
	InkjetPrinter(){
		residual_ink = 10;
	}
	InkjetPrinter(String model, String manu, boolean type, int rink){
		super(model,manu,type);
		residual_ink = rink;
	}
	void print(){ // 오버라이딩(매서드 재정의)
		super.print();
		System.out.println("잉크 잔량 : "+ --residual_ink);
	}
}
class LaserPrinter extends Printer{
	int residual_toner;
	LaserPrinter(){
		residual_toner = 10;
	}
	LaserPrinter(String model, String manu, boolean type, int rtoner){
		super(model,manu,type);
		residual_toner = rtoner;
	}
	void print(){ // 오버라이딩(매서드 재정의)
		super.print();
		System.out.println("토너 잔량 : "+ --residual_toner);
	}
}
public class Chapter5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer();
		p1.print();
		System.out.println();
		Printer p2 = new Printer("프린터","프린터 제조 회사",true);
		p2.print();
		System.out.println();
		InkjetPrinter i = new InkjetPrinter();
		i.print();
		i.print();
		System.out.println();
		LaserPrinter r1 = new LaserPrinter("레이저 프린터","레이저 프린터 제조 회사",false,20);
		r1.print();
		System.out.println();
		LaserPrinter r2 = new LaserPrinter();
		r2.print();
		r2.print();
	}

}
