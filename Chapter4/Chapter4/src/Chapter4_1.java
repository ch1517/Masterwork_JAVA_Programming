
class Song{
	private String title;
	private String artist;
	private String album;
	private String composer[];
	private int year;
	private int track;
	Song(){
		title = "제목 없음";
		artist = "가수 없음";
		album = "앨범 없음";
		composer = new String[]{"작곡가 없음"};
		year = 0;
		track = 0;
		
	}
	Song(String tit, String art, String alb, String[] com, int y, int tr){
		title = tit;
		artist = art;
		album = alb;
		composer = com;
		year = y;
		track = tr;
	}
	void show(){
		System.out.println("제목 : "+title);
		System.out.println("가수 : "+artist);
		System.out.println("앨범 : "+album);
		System.out.print("작곡가 : ");
		for(String compo : composer){
			System.out.print(compo+" ");
		}
		System.out.println();
		System.out.println("발표된 연도 : "+year);
		System.out.println("트랙번호 : "+track);
	}
	
}
public class Chapter4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song();
		s1.show();
		System.out.println();
		String array[] ={"Adele","abc","efg"};
		Song s2 = new Song("Make You Fell My Love","Adele","19",array,2008,9);
		s2.show();
	}

}
