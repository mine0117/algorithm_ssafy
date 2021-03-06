package 조합과순열;

import java.util.Arrays;
import java.util.Scanner;

public class N과M6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 1~부터 N까지 자연수
		int M = sc.nextInt(); // 중복없이 M개를 고른 수열

		int[] arr = new int[N];
		int[] result = new int[M];
		boolean[] check = new boolean[arr.length];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		go(arr, result, check, 0, 0);
	}

	private static void go(int[] arr, int[] result, boolean[] check, int start, int cnt) {

		if (cnt == result.length) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = start; i < arr.length; i++) {

			if (check[i])
				continue;

			check[i] = true;
			result[cnt] = arr[i];

			go(arr, result, check, i, cnt + 1);
			check[i] = false;
		}

	}

}
