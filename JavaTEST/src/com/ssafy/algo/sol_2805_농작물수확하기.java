package com.ssafy.algo;

import java.util.Scanner;

public class sol_2805_농작물수확하기 {

	static int[][] map;
	static int result = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // test_case = 1
		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt(); // 5
			int half = N / 2;

			map = new int[N + 1][N + 1];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();

					if (i <= half) {
						if (j >= half - i && j < half + i)
							result += map[i][j];

					} else {
						if (j >= i - half && j < N - (i - half)) {
							result += map[i][j];
						}
					}
				}

			}
			System.out.println("#" + test_case + " " + result);
		}

	}

}
