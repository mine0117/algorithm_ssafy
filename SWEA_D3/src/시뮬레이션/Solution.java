package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);

			int cnt = 1;
			int sum = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (cnt % 3 == 0) {
					cnt++;
					continue;
				}

				sum += arr[i];
				cnt++;
			}

			System.out.println("#" + test_case + " " + sum);
		}

	}
}