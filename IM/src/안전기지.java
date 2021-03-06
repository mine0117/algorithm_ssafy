import java.util.Scanner;

public class 안전기지 {

	static int N, B;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int[][] map;
	static int cnt;
	static boolean[][] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			B = sc.nextInt();
			map = new int[N + 1][N + 1];
			visited = new boolean[N + 1][N + 1];
			cnt = 0;
			int sum = 0;
			for (int i = 0; i < B; i++) {
				int y = sc.nextInt();
				int x = sc.nextInt();

				for (int k = 0; k < 4; k++) {
					for (int d = 1; d <= 2; d++) {
						int ny = y + dy[k] * d;
						int nx = x + dx[k] * d;
						if (ischecked(ny, nx)) {
							map[ny][nx]++;
						}
					}
				}
			}

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					sum = Math.max(sum, map[i][j]);
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 1 && my <= N && mx >= 1 && mx <= N) {
			return true;
		}
		return false;
	}

}
