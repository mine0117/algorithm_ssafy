import java.util.Scanner;

public class 전등켜기 {

	static int[] map;
	static int[] arr;
	static int t;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			map = new int[N + 1];
			arr = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				arr[i] = sc.nextInt();
			}
			t = 0;
			for (int i = 1; i <= N; i++) {
				if (map[i] != arr[i]) {
					for (int j = 1; j <= N; j++) {
						if (j % i == 0) {
							if (map[j] == 1) {
								map[j] = 0;
							} else {
								map[j] = 1;
							}
						}
					}
					t++;
				}

			}
			System.out.println("#" + test_case + " " + t);
		}

	}

}
