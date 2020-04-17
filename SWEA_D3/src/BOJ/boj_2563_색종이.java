package BOJ;

import java.util.Scanner;

public class boj_2563_»öÁ¾ÀÌ {

	static int[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		map = new int[101][101];
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					map[j][k] = 1;
				}
			}

		}
		int cnt = 0;
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if (map[i][j] == 1) {
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);

	}

}
