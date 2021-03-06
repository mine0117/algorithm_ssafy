package com.ssafy.algo;

import java.util.Scanner;

public class sol_7272_안경이없어 {
	static int T;
	static char[] arr, arr2;
	static int[] res;
	static boolean flag;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			String a = sc.next();
			arr = a.toCharArray();
			String b = sc.next();
			arr2 = b.toCharArray();
			flag = true;
			res = new int[26];
			if (a.length() != b.length()) {
				flag = false;
			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'A' || arr[i] == 'D' || arr[i] == 'O' || arr[i] == 'P' || arr[i] == 'Q'
						|| arr[i] == 'R') {
					res[arr[i] - 'A'] = 1;
				}

			}
		}
	}
}