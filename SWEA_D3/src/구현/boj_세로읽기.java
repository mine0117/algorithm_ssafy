package ����;

import java.util.Scanner;

public class boj_�����б� {

	static char[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		map = new char[5][15];

		for (int i = 0; i < 5; i++) {
			   String str = sc.next();

			for (int j = 0; j < str.length(); j++) {
				map[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if(map[j][i]=='\0')		// ����� �� ��, ������ �ε����� ���� �Ǵ� null ���� �� ���, �Ѿ�� ��� ���� ( continue )
					continue;
				
				System.out.print(map[j][i]);
			}
			
		}
	}

}
