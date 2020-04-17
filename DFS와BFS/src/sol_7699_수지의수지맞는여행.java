
import java.util.Scanner;

public class sol_7699_수지의수지맞는여행 {

	static int[][] map;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	static int[] v; // 방문안한 0, 방문 1
	static int R, C, cnt, result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			R = sc.nextInt();
			C = sc.nextInt();
			map = new int[R][C];
			result = 0;

			v = new int[26 + 1];
			for (int i = 0; i < R; i++) {
				String str = sc.next();
				for (int j = 0; j < C; j++) {
					map[i][j] = str.charAt(j) - 'A';

				}
			}

			dfs(0, 0, 1);
			System.out.println("#" + test_case + " " + result);
		}
	}

	private static void dfs(int x, int y, int cnt) {
		// 종료

		if (cnt == 26) {
			result = Math.max(result, cnt);
			return;
		}
		// 실행 & 재귀호출
		v[map[y][x]] = 1;
		int nx, ny;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			// 범위체크
			if (nx < 0 || nx >= C || ny < 0 || ny >= R) {
				continue;
			}
			// 방문체크
			if (v[map[ny][nx]] == 1) {
				continue;
			}

			// 재귀호출
			dfs(nx, ny, cnt + 1);

			v[map[ny][nx]] = 0;
		}
	}

}
