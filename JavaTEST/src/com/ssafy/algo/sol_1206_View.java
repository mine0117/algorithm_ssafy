package com.ssafy.algo;

import java.util.Scanner;

public class sol_1206_View {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int num = sc.nextInt();

			int[] build = new int[num];
			int sum = 0;

			for (int i = 0; i < build.length; i++) {
				build[i] = sc.nextInt();

			}
			for (int i = 2; i < build.length - 2; i++) {
				int max = 0;
				if ((build[i] > build[i + 1]) && (build[i] > build[i + 2]) && (build[i] > build[i - 1])
						&& (build[i] > build[i - 2])) {
					for (int j = i - 2; j <= i + 2; j++) {
						if (j == i) {
							continue;
						} else if (build[j] >= max) {
							max = build[j];

						}

					}
					sum += build[i] - max;
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}

	}

}