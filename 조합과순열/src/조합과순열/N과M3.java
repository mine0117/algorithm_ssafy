package 조합과순열;

import java.util.Scanner;

public class N과M3 {

	static int N;
	static int M;
	static int[] result;
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		result = new int[N];
		sb = new StringBuilder();

		go(0);
		System.out.print(sb.toString());
	}

	static void go(int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i] + " ");

			}
			sb.append("\n");
		} else {
			for (int i = 1; i <= N; i++) {
				result[cnt] = i;
				go(cnt + 1);
			}
		}
	}

}