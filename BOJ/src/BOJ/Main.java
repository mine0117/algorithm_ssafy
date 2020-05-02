package BOJ;

import java.util.Scanner;

public class Main {

	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int R, C, d;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		R = sc.nextInt();
		C = sc.nextInt();
		d = sc.nextInt();
		cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		solve(R, C, d);
		System.out.println(cnt);

	}

	private static void solve(int r, int c, int d) {
		// 1 ¹ø
		if (map[r][c] == 0) {
			map[r][c] = 2;
			cnt++;
		}

		// 2¹ø
		int leftdir = d;

		for (int k = 0; k < 4; k++) {
			leftdir = (leftdir + 3) % 4;
			int ny = r + dy[leftdir];
			int nx = c + dx[leftdir];
			if (map[ny][nx] == 0 && ischecked(ny, nx)) {
				solve(ny, nx, leftdir);
				return;
			}

		}
		// 3¹ø
		int back = (d + 2) % 4;
		int ny = r + dy[back];
		int nx = c + dx[back];
		if (ischecked(ny, nx) && map[ny][nx] != 1) {
			solve(r + dy[back], c + dx[back], leftdir);
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < M) {
			return true;
		}
		return false;
	}

}
