import java.util.Scanner;

public class 지그재그숫자0 {

	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = i + 1;
			}
			for (int i = 0; i < N; i++) {
				if (arr[i] % 2 == 0) {
					arr[i] = arr[i] * -1;
				}
			}
			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += arr[i];
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}

}
