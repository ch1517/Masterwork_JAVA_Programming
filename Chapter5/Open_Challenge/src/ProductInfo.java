import java.util.ArrayList;
import java.util.Scanner;

class Product{
	int identifier; //상품의 식별자
	String explanation; //상품 설명
	String producer; //생산자
	int price; //가격 정보
	void setId(int id){
		identifier=id;
	}
	int getId(){
		return identifier;
	}
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 설명>>");
		explanation=sc.nextLine();
		System.out.print("생산자>>");
		producer=sc.nextLine();
		System.out.print("가격>>");
		price=sc.nextInt();
	}
	void print(){
		System.out.println("상품 ID>>"+identifier);
		System.out.println("상품 설명>>"+explanation);
		System.out.println("생산자>>"+producer);
		System.out.println("가격>>"+price);
	}
}

class Book extends Product{
	int ISBNnum; //ISBN 번호
	String writer; // 저자
	String book_title; // 책 제목

	void input(){
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목>>");
		book_title=sc.nextLine();
		System.out.print("저자>>");
		writer=sc.nextLine();
		System.out.print("ISBN 번호>>");
		ISBNnum=sc.nextInt();
	}
	void print(){
		super.print();
		System.out.println("ISBN>>"+ISBNnum);
		System.out.println("책 제목>>"+book_title);
		System.out.println("저자>>"+writer);
	}
}

class CompactDisc extends Product{
	String album_title;
	String singer_name;

	void input(){
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("앨범 제목>>");
		album_title=sc.nextLine();
		System.out.print("가수>>");
		singer_name=sc.nextLine();
	}
	void print(){
		super.print();
		System.out.println("앨범 제목>>"+album_title);
		System.out.println("가수>>"+singer_name);
	}
}

class ConversationBook extends Book{
	String languageInfo;
	
	void input(){
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("언어>>");
		languageInfo=sc.next();
		
	}
	void print(){
		super.print();
		System.out.println("언어>>"+languageInfo);
	}
}
public class ProductInfo {
	static ArrayList<Product> productList = new ArrayList<Product>();
	
	static void productAdd(){
		Scanner sc = new Scanner(System.in);
		System.out.printf("상품 종류 책(1), 음악CD(2), 회화책(3)>>");
		Product p=null;
		int num=sc.nextInt();
		
		switch(num){
			case 1:
				p = new Book();
				break;
			case 2:
				p = new CompactDisc();
				break;
			case 3:
				p = new ConversationBook();
				break;
		}
		p.input();
		p.setId(productList.size());
		productList.add(p);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		while(true){
			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3)>>");
			num=sc.nextInt();
			if(num==1){
				productAdd();
			}
			else if(num==2){
				for(int i=0;i<productList.size();i++){
					productList.get(i).print();
					System.out.println();
				}
			}
			else if(num==3){
				break;
			}
			else{
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}

}
