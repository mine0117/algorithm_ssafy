import java.util.Scanner;

public class sol_5632_гу {
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			int[] arr = new int[N];
			int[] dp = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			int max = 0;
			dp[0] = arr[0];
			max = arr[0];
			for (int i = 1; i < N; i++) {
				dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);

				max = Math.max(max, dp[i]);
			}
			System.out.println("#" + test_case + " " + max);

		}
	}
}