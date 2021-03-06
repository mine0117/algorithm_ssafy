import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Ä¡ÁîµµµÏ {

	static int[][] map;
	static boolean[][] visited;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	static int N, cnt;
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new int[N][N];
	
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int max = Integer.MIN_VALUE;
			for (int t = 0; t <= 100; t++) {
				cnt = 0;
				visited = new boolean[N][N];
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (map[i][j] > t && !visited[i][j]) {
							visited[i][j] = true;
							dfs(i, j, t);
							cnt++;
						}
					}
				}
				max = Math.max(max, cnt);
			}

			System.out.println("#" + test_case + " " + max);
		}
	}

	private static void dfs(int y, int x, int t) {
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (ischecked(ny, nx) && !visited[ny][nx] && map[ny][nx] > t) {
				visited[ny][nx] = true;
				dfs(ny, nx, t);
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
