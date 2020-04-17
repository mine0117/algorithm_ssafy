package D3;

import java.util.Scanner;

public class sol_8338_°è»ê±â {

	static int T, N, max;
	static int[] arr, dp;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		N = sc.nextInt();
		arr = new int[N];
		dp = new int[N];
		max = 0;
		for (int test_case = 1; test_case <= T; test_case++) {

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			dp[0] = arr[0];

			for (int i = 1; i < N; i++) {

				max = Math.max(dp[i - 1] + arr[i], dp[i - 1] * arr[i]);
				dp[i] = max;
				System.out.println(dp[i]);
			}
			//System.out.println("#" + test_case + " " + dp[N-1]);
		}
	}

}
