package com.ssafy.algo;

import java.util.Scanner;

public class sol_소금쟁이 {

	static int[] dy = { 0, -1, 1, 0, 0 };
	static int[] dx = { 0, 0, 0, -1, 1 };
	static int[][] map;
	static int sum;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트 케이스 수

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 연목의 크기 (N*N)
			map = new int[N][N];
			int num = sc.nextInt(); // 소금쟁이 수
			sum = 0;

			aa:for (int i = 0; i < num; i++) {
				int startY = sc.nextInt(); // 소금쟁이 시작좌표 Y
				int startX = sc.nextInt(); // 소금쟁이 시작좌표 X
				int d = sc.nextInt(); // 소금쟁이 방향
				if(map[startY][startX] == 1) 
					continue aa;
				map[startY][startX] = 1;
				
				for (int j = 3; j > 0; j--) {
					int fy = startY + (dy[d] * j);
					int fx = startX + (dx[d] * j);
					if (fy >= 0 && fy < N && fx >= 0 && fx < N && map[fy][fx] != 1) {
						map[startY][startX] = 0;
						startY = fy;
						startX = fx;
						map[startY][startX] = 1;

					} else {
						map[startY][startX] = 0;
						break;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						sum++;
					}
				}
			}
			System.out.println("#" + sum);
		}

	}

}
