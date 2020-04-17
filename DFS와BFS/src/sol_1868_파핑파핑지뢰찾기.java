
import java.util.Scanner;

public class sol_1868_파핑파핑지뢰찾기 {

	static char[][] map;
	static int N, x, y, res;

	static boolean[][] visited;
	static int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			map = new char[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j);

				}
			}
			int cnt = 0;
			res = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == '*')
						continue;

					if (map[i][j] == '.') {
						cnt = 0;
						for (int k = 0; k < 8; k++) {
							int ny = i + dy[k];
							int nx = j + dx[k];
							if (check(ny, nx) && map[ny][nx] == '*') {
								cnt++;

							}
						}
						if (cnt == 0) {
							y = i;
							x = j;
							res++;
							dfs(y, x);
						}

					}

				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] =='.') {
						res++;
					}
				}
			}
			System.out.println("#" + test_case + " " + res);
		}

	}

	private static void dfs(int y, int x) {
		int cnt = 0;
		// 지뢰 8방향에 대해서 갯수 세기
		for (int k = 0; k < 8; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (check(ny, nx) && map[ny][nx] == '*') {
				cnt++;

			}
		}
		// 현위치에 갯수기록
		map[y][x] = (char) ('0' + cnt);
		// 갯수가 0이라면

		if (cnt == 0) {

			// 8방향에 대해서 재귀호출

			for (int k = 0; k < 8; k++) {
				int ny = y + dy[k];
				int nx = x + dx[k];
				if (check(ny, nx) && map[ny][nx] == '.') {

					dfs(ny, nx);
				}
			}

		}
	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {

			return true;
		}
		return false;
	}

}
