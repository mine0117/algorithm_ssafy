package com.ssafy.algo;

import java.util.Scanner;

public class sol_7236_저수지의물의총깊이구하기 {

	static int N;
	static int[][] arr;
	static int[] dx = { 1, 0, -1, 0, 1, -1, 1, -1 };
	static int[] dy = { 0, 1, 0, -1, 1, 1, -1, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			arr = new int[N][N];
			int res = 0;
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++) {
					char c = sc.next().charAt(0);
					if (c == 'G')
						arr[i][j] = 1;
				}

			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					if (arr[i][j] == 0) {
						int sum = 0;
						for (int k = 0; k < 8; k++) {
							int nx = i + dx[k];
							int ny = j + dy[k];
							if (nx < 0 || ny < 0 || nx >= N || ny >= N || arr[nx][ny] == 1)
								continue;
							sum++;
						}
						if (sum == 0)
							sum = 1;
						res = Math.max(res, sum);
					}
			System.out.println("#" + test_case + " " + res);
		}
	}
}
