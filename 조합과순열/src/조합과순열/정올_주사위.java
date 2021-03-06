package 조합과순열;

import java.util.Scanner;

public class 정올_주사위 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 3
		int M = sc.nextInt(); // 1

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] result = new int[N]; // result[3];
		boolean[] check = new boolean[arr.length];
		if (M == 1) {
			m1(arr, result, 0); // m1(6, 3, 0)
		} else if (M == 2) {
			m2(arr, result, 0, 0);
		} else if (M == 3) {
			m3(arr, result, check, 0);
		}

	}

	static void m1(int[] arr, int[] result, int idx) {
		if (idx == result.length) {
			for (int i = 0; i < idx; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			result[idx] = arr[i];
			m1(arr, result, idx + 1);
		}
	}

	static void m2(int[] arr, int[] result, int cnt, int target) {
		if (cnt == result.length) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		} else if (target == arr.length)
			return;

		result[cnt] = arr[target];
		m2(arr, result, cnt + 1, target);
		m2(arr, result, cnt, target + 1);
	}

	static void m3(int[] arr, int[] result, boolean[] check, int idx) {
		if (idx == result.length) {
			for (int i = 0; i < idx; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				result[idx] = arr[i];
				check[i] = true;
				m3(arr, result, check, idx + 1);
				check[i] = false;
			}
		}
	}

}