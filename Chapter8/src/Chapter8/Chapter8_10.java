package Chapter8;
//10번
//OpenChallege에 주어진 행맨 게임을 다음과 같이 수정하여 완성하라.
//words.txt파일에 있는 모든 단어를 25143개의 String 배열에 읽은 뒤 단어를 선택하도록 수정하라.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		BufferedReader in = null; // 파일을 읽어오는 버퍼
		ArrayList<String> array = new ArrayList<String>(25143);
		char replay = 'y'; // 게임을 실행할 것인가
		int result; // 게임 결과
		String str;
		Scanner s = new Scanner(System.in);
		try {
			in = new BufferedReader(
					new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Open_Challenge\\words.txt"));
			while(in.ready()) {
				array.add(in.readLine());
			}
			in.close();
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
		while(replay=='y') {
			
			random = (int)(Math.random()*25142);
			str=array.get(random);
			System.out.println("지금부터 행맨 게임을 시작합니다.");
			System.out.print("몇 글자를 숨길까요?(1~"+str.length()+")");
			// 난이도를 입력받는다.
			// 단 숨길 단어의 수가 현재 단어의 글자 수를 넘어가는 것을 방지하기 위해서
			// 플레이어에게 범위 글자 수를 알려준다.
			result = startGame(str,s.nextInt());
			// 입력 받은 수는 바로 함수의 level 파라메타로 넘겨준다.
			System.out.println(str); // 정답 문자열 알려주기
			if(result==0) {
				System.out.println("5번 실패 하였습니다.");
			}
			System.out.print("Next(y/n)?");
			replay=s.next().charAt(0);
		}
	}
	static int startGame(String str, int level) {
		int fail=0; // 실패 횟수
		int success=0; // 성공 횟수
		char word[] = str.toCharArray();
		char hidden[] = str.toCharArray();
		int tmp[] = new int[level];
		Scanner s = new Scanner(System.in);
		char ch; // 플레이어에게 입력받는 한 글자
		for(int i=0;i<level;i++) { // 숨길 인덱스 랜덤 생성
			tmp[i]=(int)(Math.random()*str.length());
			for(int j=0;j<i;j++) { // 중복 제거
				if(tmp[j]==tmp[i]) {
					tmp[i]=(int)(Math.random()*str.length());
					j=-1;
					
				}
			}
			hidden[tmp[i]]='-';
		}
		int i;
		while(fail!=5) {
			System.out.println(hidden);
			System.out.print(">>");
			ch=s.next().charAt(0);
			for(i=0;i<tmp.length;i++) { 
				// 플레이어가 입력한 글자가 숨겨진 글자 중 하나와 일치하는지 검사 
				if(word[tmp[i]]==ch) {
					hidden[tmp[i]]=ch;
					success++; // 성공 카운트 하나 증가
				}
			}
			if(i==tmp.length) { // 숨겨진 글자 중 하나가 아니었을 시 
				fail++; // 실패 카운트 증가
			}
			if(success==level) { // 다 맞췄을 시 while문 빠져나가기
				break;
			}
		}
		if(fail==5) { // 실패 카운트가 5일 때
			return 0; // 실패를 반환
		} else { // 5가 아닐 때(5번 안에 성공했을 때)
			return 1; // 성공을 반환
		}
	}


}
