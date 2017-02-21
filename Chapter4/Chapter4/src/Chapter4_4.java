class ArrayUtility2{
	//s1과 s2를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2){
		
		int arrayTmp[] = new int[s1.length+s2.length];
		for(int i=0;i<arrayTmp.length;i++){
			if(i<s1.length){
				arrayTmp[i] = s1[i];
			} else {
				arrayTmp[i] = s2[i-s1.length];
			}
		}
		return arrayTmp;
	}
	//s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
	static int[] remove(int[] s1, int[] s2){
		int a = s1.length;
		for(int i=0;i<s1.length;i++){
			for(int j=0;j<s2.length;j++){
				if(s1[i]==s2[j]){
					for(int k = i;k<s1.length-1;k++){
						s1[k]=s1[k+1];	
					}
					a--;
				}
			}	
		}
		int arrayTemp[] = new int[a];
		for(int i=0;i<a;i++){
			arrayTemp[i]=s1[i];
		}
		return arrayTemp;
	}
}
public class Chapter4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {1,2,3,4,5};
		int array2[] = {6,7,8,9,10};
		ArrayUtility2 a1 = new ArrayUtility2();
		int array3[] = a1.concat(array1, array2);
		System.out.print("concat : ");
		for(int num:array3){
			System.out.print(num +" ");
		}

		int array4[] = {2,4,6,8,10};
		System.out.println();
		System.out.print("remove : ");
		int array5[] = a1.remove(array1, array4);
		for(int num:array5){
			System.out.print(num+" ");
		}
	}
}
