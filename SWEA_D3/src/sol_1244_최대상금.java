import java.util.Arrays;
import java.util.Scanner;

public class sol_1244_최대상금 {
	static int[] arr;
	static int max, N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();
			N = sc.nextInt();
			arr = new int[str.length()];

			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i) - '0';
			}
			max = 0;
			go(0, 0);

		}
	}

	private static void go(int start, int cnt) {
		if (cnt == N) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

	}

}
