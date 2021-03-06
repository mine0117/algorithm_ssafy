package BOJ;

import java.util.Scanner;

public class Ω∫≈√ {

	static int[][] map;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static boolean[][] visited;
	static int N;
	static int max;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();

			}
		}
		int cnt;
		int max = 0;
		for (int k = 0; k <= 100; k++) {
			cnt = 0;
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (k <= map[i][j] && !visited[i][j]) {
						visited[i][j] = true;
						dfs(i, j, k);
						cnt++;
						//print();	 
						System.out.println(cnt + " " + k+" "+ map[i][j]);
					}
					
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}

	private static void dfs(int y, int x, int i) {

		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];

			if (ischecked(ny, nx) && !visited[ny][nx] && map[ny][nx] >= i) {

				visited[ny][nx] = true;
				dfs(ny, nx, i);
			}
		}
	}

	private static boolean ischecked(int my, int mx) {
		if (mx >= 0 && mx < N && my >= 0 && my < N) {
			return true;
		}
		return false;
	}

	static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}