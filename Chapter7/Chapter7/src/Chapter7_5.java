import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3;i++){
			Student st = new Student();
			System.out.print("이름을 입력하시오 : ");
			st.name = sc.next();
			System.out.print("학과를 입력하시오 : ");
			st.department = sc.next();
			System.out.print("학번을 입력하시오 : ");
			st.classnum = sc.nextInt();
			System.out.print("학점평균을 입력하시오 : ");
			st.averscore = sc.nextDouble();
			System.out.println();
			a.add(st);
		}
		for(int i=0;i<a.size();i++){
			System.out.println("이름 : "+a.get(i).name);
			System.out.println("학과 : "+a.get(i).department);
			System.out.println("학번 : "+a.get(i).classnum);
			System.out.println("학점평균 : "+a.get(i).averscore);
		}
	}
}
class Student{
	String name;
	String department;
	int classnum;
	double averscore;
}