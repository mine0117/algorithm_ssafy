package com.ssafy.algo;

import java.util.Scanner;

public class sol_1288_새로운불면증치료법 {

	static boolean[] flag = new boolean[10];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			boolean[] checked = new boolean[10];
			int i = 1;
			boolean flag = true;
			while (flag) {
				int iN = i * N;

				while (iN != 0) {
					int num = iN % 10;
					checked[num] = true;
					iN = iN / 10;
				}
				int cnt = 0;
				for (int j = 0; j < 10; j++) {
					if (!checked[j]) {
						break;
					}
					cnt++;
				}
				if (cnt == 10) {
					flag = false;
				}
				i++;
			}
			System.out.println("#" + test_case + " " + --i * N);
		}
	}

}
