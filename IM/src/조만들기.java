import java.util.Scanner;

public class 조만들기 {

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int K = sc.nextInt();

			arr = new int[K];
			boolean flag = true;
			int cnt = 1;
			for (int i = 0; i < N; i++) {
				if (flag) {
					for (int j = 0; j < K; j++) {
						arr[j] += cnt;
						cnt++;
					}
					flag = false;
				} else {
					for (int j = K - 1; j >= 0; j--) {
						arr[j] += cnt;
						cnt++;
					}
					flag = true;
				}
			}
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}