package 조합과순열;

import java.util.Scanner;

public class N과M1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 1~부터 N까지 자연수
		int M = sc.nextInt(); // 중복없이 M개를 고른 수열

		int[] arr = new int[N];
		int[] result = new int[M];
		boolean[] check = new boolean[arr.length];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		go(arr, result, check, 0);
	} 

	private static void go(int[] arr, int[] result, boolean[] check, int cnt) {

		if (cnt == result.length) {
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				result[cnt] = arr[i];
			
				check[i] = true;
				go(arr, result, check, cnt + 1);
				check[i] = false;
			}

		}

	}

}
