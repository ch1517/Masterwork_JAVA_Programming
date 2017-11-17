
class ArrayUtility{
	static double[] intToDouble(int [] source){ //int 배열을 double 배열로 변환 
		double arrayTmp[] = new double[source.length]; // double 배열을 int 배열로 변환 
		for(int i=0;i<source.length;i++){
			arrayTmp[i]=(double)source[i];
		}
		return arrayTmp;
	}
	static int [] doubleToInt(double [] source){
		int arrayTmp[] = new int[source.length];
		for(int i=0;i<source.length;i++){
			arrayTmp[i]=(int)source[i];
		}
		return arrayTmp;
	}
}
public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayInt[] = {1,2,3,4,5};
		double arrayDouble[] = {1.2,2.3,3.4,4.5,5.6};
		ArrayUtility a1 = new ArrayUtility();
		double alterDouble[] = ArrayUtility.intToDouble(arrayInt);
		int alterInt[] = ArrayUtility.doubleToInt(arrayDouble);
		System.out.print("바뀌기 전(int) : ");
		for(int num: arrayInt){
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.print("바뀐 후(double) : ");
		for(double num: alterDouble){
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("바뀌기 전(double) : ");
		for(double num: arrayDouble){
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.print("바뀐 후(int) : ");
		for(int num: alterInt){
			System.out.print(num+" ");
		}
	}

}
