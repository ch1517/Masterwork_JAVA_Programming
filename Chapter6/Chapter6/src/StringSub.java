
public class StringSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "They is students.";
		int i=0;
		for(;i<str.length();i++){
			if(str.charAt(i)=='i')
				if(str.charAt(i+1)=='s'){
					break;
				}
		}
		StringBuffer sb = new StringBuffer(str);
		sb.replace(i, i+2, "are");
		System.out.println(sb);
	}

}
