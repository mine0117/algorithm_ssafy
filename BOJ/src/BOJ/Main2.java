package BOJ;

import java.util.Scanner;

public class Main2 {

	static int[][] map;
	static int[][] arr;
	static int N, M;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	static boolean[][] visited;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		arr = new int[N][M];
		visited = new boolean[N][M];
		ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		dfs();
	}

	public static void dfs() {

		int ans = 0;
		while (true) {
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (!visited[i][j] && map[i][j] != 0) {
						go(i, j);
						cnt++;
					}
				}
			}
			if (cnt == 0) {
				System.out.println(0);
				break;
			} else if (cnt >= 2) {
				System.out.println(ans);
				break;
			}
			melting();
			ans++;
		}

	}

	private static void go(int y, int x) {
		visited[y][x] = true;
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (ischecked(ny, nx)) {
				if (map[ny][nx] == 0) {
					arr[y][x]++;
				}
				if (!visited[ny][nx] && map[ny][nx] != 0) {
					go(ny, nx);
				}
			}
		}
	}

	private static void melting() {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] -= arr[i][j];
				if (map[i][j] < 0) {
					map[i][j] = 0;
				} else {
					visited[i][j] = false;
					arr[i][j] = 0;
				}

			}
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < M) {
			return true;
		}
		return false;
	}

}