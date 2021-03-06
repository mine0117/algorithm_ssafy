package com.ssafy.algo;

import java.util.Scanner;

public class sol_8104_조만들기 {

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int count = 1;
			boolean flag = true;
			arr = new int[K];

			for (int i = 0; i < N; i++) {
				if (flag) {
					for (int j = 0; j < K; j++) {
						arr[j] += count;
						count++;

					}
					flag = false;
					
				} else {
					for (int j = K - 1; j >= 0; j--) {
						arr[j] += count;
						count++;
					}
					flag = true;
				}

			}
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}