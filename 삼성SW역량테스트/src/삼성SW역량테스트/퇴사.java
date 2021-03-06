package »ï¼ºSW¿ª·®Å×½ºÆ®;

import java.util.Scanner;

public class Åð»ç {

	static int N, ans;
	static int[] T, P;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		ans = 0;
		T = new int[N];
		P = new int[N];

		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		dfs(0, 0);
		System.out.println(ans);
	}

	private static void dfs(int idx, int val) {
		if (idx >= N) {
			ans = Math.max(ans, val);
			return;
		}

		if (idx + T[idx] <= N) {
			dfs(idx + T[idx], val + P[idx]);
		} else {
			dfs(idx + T[idx], val);
		}
		dfs(idx + 1, val);

	}

}
