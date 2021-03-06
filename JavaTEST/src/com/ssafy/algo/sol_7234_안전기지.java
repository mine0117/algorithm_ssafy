package com.ssafy.algo;

import java.util.Scanner;

public class sol_7234_안전기지 {

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };

	static int[][] map;
	static int sum;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 구역 길이
			int B = sc.nextInt(); // 안전기지 갯수
			map = new int[N + 1][N + 1];

			for (int i = 0; i < B; i++) {
				int y = sc.nextInt();
				int x = sc.nextInt();
				 sum = 0;
				sum += map[y][x]++;

				for (int j = 0; j < 4; j++) {
					int my = y + dy[j];
					int mx = x + dx[j];
					if (my > 0 && my <= N && mx > 0 && mx <= N) {
						sum += map[my][mx]++;
						if (my > 0 && my <= N && mx > 0 && mx <= N) {
							sum += map[my][mx]++;
						}
					}
				}
			}
			// for (int i = 0; i < N; i++) {
			// for (int j = 0; j < N; j++) {
			// System.out.print(map[i][j] + " ");
			// }
			// System.out.println();
			// }
			//
			System.out.println("#" + " " + test_case + " " + sum);
		}
	}
}