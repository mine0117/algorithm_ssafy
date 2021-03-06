package 조합과순열;

import java.util.Scanner;

public class 모든순열 {

	static int N;
	static int[] result;
	static boolean[] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		result = new int[N + 1];
		visited = new boolean[N + 1];
		go(0);
	}

	private static void go(int cnt) {
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (visited[i])
				continue;
			
				result[cnt] = i;
			visited[i] = true;
			go(cnt + 1);
			visited[i] = false;
		}

	}

}
