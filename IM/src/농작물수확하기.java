import java.util.Scanner;

public class 농작물수확하기 {

	static int[][] map;
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}

			int mid = N / 2;
			int sum = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (i <= mid) {
						if (j >= mid - i && j <= mid + i) {
							sum += map[i][j];
						}
					} else {
						if (j >= i - mid && j < N - (i - mid)) {
							sum += map[i][j];
						}
					}
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}

	}

}
