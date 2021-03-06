import java.util.Scanner;

public class 저수지의물의총깊이구하기 {

	static char[][] map;
	static int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dx = { -1, -1, 1, 1, 1, 0, -1, -1 };
	static boolean[][] visited;
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new char[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			int sum = 0;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'W') {
						int cnt = 0;
						for (int k = 0; k < 8; k++) {
							int ny = i + dy[k];
							int nx = j + dx[k];
							if (ischecked(ny, nx) && map[ny][nx] == 'W') {
								cnt++;
							}
						}
						sum += cnt;
						if (sum == 0) {
							sum = 1;
						}
					}
					max = Math.max(max, sum);
					sum = 0;
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}

}
