package com.ssafy.algo;

import java.util.Scanner;

public class sol_1209_Sum {
	static int sum;
	static int sum1;
	static int sum2;
	static int sum3;
	static int max ; // 가로

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];

		for (int test_case = 1; test_case <= 10; test_case++) {
			
			int num = sc.nextInt();
				
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j < 100; j++) {
						arr[i][j] = sc.nextInt();
					}
				}

				max = 0;
				
				for (int y = 0; y < 100; y++) { // 가로
					sum = 0;
					for (int x = 0; x < 100; x++) {
						sum += arr[y][x]; // 가로
						if (max <= sum) {
							max = sum;
						}

					}

				}
				for (int y = 0; y < 100; y++) { // 세로
					sum1 = 0;
					for (int x = 0; x < 100; x++) {
						sum1 += arr[x][y];
						if (max <= sum1) {
							max = sum1;
						}
					}
				}
				for (int z = 0; z <100; z++) { // 대각선
					sum2 = 0;
					sum2 += arr[z][z];
					if (max <= sum2) {
						max = sum2;
					}
				}
				for (int i = 0; i < 100; i++) {
					sum3 = 0;
					for (int j = 99; j >=0; j--) {
						sum3 = arr[i][j];
					}
					if (max <= sum3) {
						max = sum3;
					}
				}
				
			
			System.out.println("#"+test_case+" "+ max);

		}
	}

}
