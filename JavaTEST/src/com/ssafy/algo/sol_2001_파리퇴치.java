package com.ssafy.algo;

import java.util.Scanner;

public class sol_2001_파리퇴치 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt(); // 영역
			int m = sc.nextInt(); // 파리채
			int arr[][] = new int[n][n];
		
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < n; b++) {
					arr[a][b] = sc.nextInt();
				}
			}
			int sum, max = 0;
			for (int i = 0; i < n - m + 1; i++) { // 0,1,2,3 < 6 - 3 + 1 = 4
				for (int j = 0; j < n - m + 1; j++) { // 0,1,2,3, < 6 - 3 + 1 = 4
					sum = 0;
					for (int k = 0; k < m; k++) { // 0, 1, 2 < 3
						for (int l = 0; l < m; l++) { // 0, 1, 2 < 3
							sum += arr[i + k][j + l];
						}
					}
					if (sum > max)
						max = sum;
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}
}