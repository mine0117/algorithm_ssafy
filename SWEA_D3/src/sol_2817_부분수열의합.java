import java.util.Scanner;

public class sol_2817_부분수열의합 {

	static int[] arr;
	static int T, N, K, result;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		arr = new int[N];
		for (int test_case = 1; test_case <= T; test_case++) {

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			go(0, 0);
			System.out.println("#" + test_case + " " + result);
		}

	}

	private static void go(int cnt, int sum) {

		if (sum == K) {
			result++;
			return;
		}
		if (sum > K || cnt >= N)
			return;

		go(cnt + 1, sum + arr[cnt]);
		go(cnt + 1, sum);
	}

}
