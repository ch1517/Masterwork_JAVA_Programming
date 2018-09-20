import java.util.StringTokenizer;
//Chapter6_10
public class Query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = args[0];
		StringTokenizer st = new StringTokenizer(query, "&=");
		int n = st.countTokens();
		for(int i=0;i<n;i++){ // n의 자리에 st.countToken()을 바로 넣으면 for문이 덜 돈다.
			System.out.print(st.nextToken()+"\t");
			if(i%2!=0){
				System.out.println();
			}
		}
	}
}
