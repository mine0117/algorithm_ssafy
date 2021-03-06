import java.util.Scanner;

public class ±âÁö±¹ {

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
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'A') {
						for (int k = 0; k < 4; k++) {
							int ny = i + dy[k];
							int nx = j + dx[k];
							if (ischecked(ny, nx) && map[ny][nx] == 'H') {
								map[ny][nx] = 'X';
							}
						}
					} else if (map[i][j] == 'B') {
						for (int k = 0; k < 4; k++) {
							for (int d = 1; d <= 2; d++) {
								int ny = i + dy[k] * d;
								int nx = j + dx[k] * d;
								if (ischecked(ny, nx) && map[ny][nx] == 'H') {
									map[ny][nx] = 'X';
								}
							}

						}
					} else if (map[i][j] == 'C') {
						for (int k = 0; k < 4; k++) {
							for (int d = 1; d <= 3; d++) {
								int ny = i + dy[k] * d;
								int nx = j + dx[k] * d;
								if (ischecked(ny, nx) && map[ny][nx] == 'H') {
									map[ny][nx] = 'X';
								}
							}

						}
					}
				}
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'H') {
						cnt++;
					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}

	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}
}
