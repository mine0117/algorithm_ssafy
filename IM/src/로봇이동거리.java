import java.util.Scanner;

public class 로봇이동거리 {

	static char[][] map;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new char[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'A') {
						for (int k = j + 1; k < N; k++) {
							if (k < N && map[i][k] == 'S') {
								cnt++;
							} else {
								break;
							}
						}
					} else if (map[i][j] == 'B') {
						for (int k = j + 1; k < N; k++) {
							if (k < N && map[i][k] == 'S') {
								cnt++;
							} else {
								break;
							}
						}
						for (int k = j - 1; k >= 0; k--) {
							if (k >= 0 && map[i][k] == 'S') {
								cnt++;
							} else {
								break;
							}
						}
					} else if (map[i][j] == 'C') {
						for (int k = 0; k < 4; k++) {
							int ny = i + dy[k];
							int nx = j + dx[k];
							if (ischecked(ny, nx) && map[ny][nx] == 'S') {
								cnt++;
							} else {
								break;
							}

						}
					}
				}
				System.out.println(cnt);
			}
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}

}
