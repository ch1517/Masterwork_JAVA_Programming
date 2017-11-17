import java.util.Scanner;

public class Chapter2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.print("주민등록번호를 입력하시오(예:910218-*******) : ");
		System.out.println(s.next());
	}

}
