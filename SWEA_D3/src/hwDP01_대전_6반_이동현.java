import java.util.Scanner;

public class hwDP01_대전_6반_이동현 {

	static int[] arr;
	static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		arr = new int[N + 1];
		dp = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}

		dp[1] = arr[1];

		if (N >= 2)
			dp[2] = dp[1] + arr[2]; 

		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
		}
		System.out.println(dp[N]);
	}
}