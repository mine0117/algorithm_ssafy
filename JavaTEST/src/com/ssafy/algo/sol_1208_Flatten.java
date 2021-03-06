package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class sol_1208_Flatten {

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {

			int N = sc.nextInt();
			arr = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for (int i = 0; i < N; i++) {
				arr[99]--;
				arr[0]++;
				Arrays.sort(arr);
			}
			System.out.println("#" + test_case + " " + (arr[99] - arr[0]));
		}

	}
}