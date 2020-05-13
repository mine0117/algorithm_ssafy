package BOJ;

import java.util.Scanner;

public class test12 {

	static int[] arr, result;
	static int N;
	static boolean[] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N];
		result = new int[N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		dfs(0);
	}

	private static void dfs(int cnt) {
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(result[i] + " ");

			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i])
				visited[i] = true;
			result[i] = i + 1;
			dfs(cnt + 1);
			visited[i] = false;
		}

	}

}