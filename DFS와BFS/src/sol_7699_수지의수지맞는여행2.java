import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sol_7699_수지의수지맞는여행2 {

	static char[][] map;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static boolean[] visited;
	static int R, C, cnt, result, ant;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			result = 0; // 최대값, 최소값

			R = sc.nextInt();
			C = sc.nextInt();
			map = new char[R][C];
			visited = new boolean[26];
			for (int i = 0; i < R; i++) {
				String str = sc.next();
				for (int j = 0; j < C; j++) {
					map[i][j] = str.charAt(j);

				}
			}

			visited[map[0][0] - 'A'] = true;
			dfs(0, 0, 0);
			System.out.println("#" + test_case + " " + cnt);
		}
	}

	private static void dfs(int y, int x, int cnt) {

		if (cnt == ant) {
			ant = cnt;
		}
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (check(ny, nx) && !visited[map[ny][nx] - 'A']) {
				visited[map[ny][nx] - 'A'] = true;
				dfs(ny, nx, cnt + 1);
				visited[map[ny][nx] - 'A'] = false;
			}
		}
	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < R && mx >= 0 && mx < C) {
			return true;
		}

		return false;
	}

}
