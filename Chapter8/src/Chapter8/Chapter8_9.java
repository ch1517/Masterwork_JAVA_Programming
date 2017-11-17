package Chapter8;
//9��
//OpenChallenge�� �־��� ��� ������ ������ ���� �����Ͽ� �ϼ��϶�.
//������ ���̵��� ����ڷκ��� �Է¹ް� ���̵��� ���� ����� ������ ���� 3,4,5 ������ �����ϵ��� �����϶�.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Chapter8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		BufferedReader in = null; // ������ �о���� ����
		char replay = 'y'; // ������ ������ ���ΰ�
		int result; // ���� ���
		String str;
		Scanner s = new Scanner(System.in);
		try {
			while(replay=='y') {
				in = new BufferedReader(
						new FileReader("C:\\Users\\doqtq\\Documents\\Chapter8\\src\\Open_Challenge\\words.txt"));
				random = (int)(Math.random()*25143);
				for(int i=0;i<random-1;i++) {
					in.readLine();
				}
				str = in.readLine(); // random ��° ���ڿ�
				System.out.println("���ݺ��� ��� ������ �����մϴ�.");
				System.out.print("�� ���ڸ� ������?(1~"+str.length()+")");
				// ���̵��� �Է¹޴´�.
				// �� ���� �ܾ��� ���� ���� �ܾ��� ���� ���� �Ѿ�� ���� �����ϱ� ���ؼ�
				// �÷��̾�� ���� ���� ���� �˷��ش�.
				result = startGame(str,s.nextInt());
				// �Է� ���� ���� �ٷ� �Լ��� level �Ķ��Ÿ�� �Ѱ��ش�.
				System.out.println(str); // ���� ���ڿ� �˷��ֱ�
				if(result==0) {
					System.out.println("5�� ���� �Ͽ����ϴ�.");
				}
				System.out.print("Next(y/n)?");
				replay=s.next().charAt(0);
			}
			in.close();
		}catch(IOException e) {
			System.out.println("���� ����� ����");
		}
	}
	static int startGame(String str, int level) {
		int fail=0; // ���� Ƚ��
		int success=0; // ���� Ƚ��
		char word[] = str.toCharArray();
		char hidden[] = str.toCharArray();
		int tmp[] = new int[level];
		Scanner s = new Scanner(System.in);
		char ch; // �÷��̾�� �Է¹޴� �� ����
		for(int i=0;i<level;i++) { // ���� �ε��� ���� ����
			tmp[i]=(int)(Math.random()*str.length());
			for(int j=0;j<i;j++) { // �ߺ� ����
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
				// �÷��̾ �Է��� ���ڰ� ������ ���� �� �ϳ��� ��ġ�ϴ��� �˻� 
				if(word[tmp[i]]==ch) {
					hidden[tmp[i]]=ch;
					success++; // ���� ī��Ʈ �ϳ� ����
				}
			}
			if(i==tmp.length) { // ������ ���� �� �ϳ��� �ƴϾ��� �� 
				fail++; // ���� ī��Ʈ ����
			}
			if(success==level) { // �� ������ �� while�� ����������
				break;
			}
		}
		if(fail==5) { // ���� ī��Ʈ�� 5�� ��
			return 0; // ���и� ��ȯ
		} else { // 5�� �ƴ� ��(5�� �ȿ� �������� ��)
			return 1; // ������ ��ȯ
		}
	}


}