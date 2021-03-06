import java.util.Scanner;

public class Solution {

	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static char[][] map;
	static int n, cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			n = sc.nextInt();
			map = new char[n][n];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				for (int j = 0; j < n; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
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
							for (int z = 1; z <= 2; z++) {
								int ny = i + dy[k] * z;
								int nx = j + dx[k] * z;

								if (ischecked(ny, nx) && map[ny][nx] == 'H') {
									map[ny][nx] = 'X';
								}
							}
						}
					} else if (map[i][j] == 'C') {
						for (int k = 0; k < 4; k++) {
							for (int z = 1; z <= 3; z++) {
								int ny = i + dy[k] * z;
								int nx = j + dx[k] * z;

								if (ischecked(ny, nx) && map[ny][nx] == 'H') {
									map[ny][nx] = 'X';
								}
							}
						}
					}

				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == 'H') {
						cnt++;
					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < n && mx >= 0 && mx < n) {
			return true;
		}
		return false;
	}
}
