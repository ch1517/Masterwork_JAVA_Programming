import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Chapter7_7 {
	public static Vector<String> hashToVector(HashMap<String, String> h){
		Vector<String> value = new Vector<String>();
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()){
			value.add(h.get(it.next()));
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		Vector<String> v = Chapter7_7.hashToVector(h);
		for(int n=0;n<v.size();n++)
			System.out.println(v.get(n));
		
	}

}
