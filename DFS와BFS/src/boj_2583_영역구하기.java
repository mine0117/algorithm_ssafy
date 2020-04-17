import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class boj_2583_영역구하기 {

	static int[][] map;
	static boolean[][] visited;
	static int x1, sy, lx, ly, cnt;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int N, M, K;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();

		map = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < K; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			for (int j = y1; j < y2; j++) {
				for (int l = x1; l < x2; l++) {
					map[j][l] = 1;

				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					cnt = 0;
					dfs(i, j, cnt + 1);
					al.add(cnt);
				}
			}
		}
		Collections.sort(al);
		System.out.println(al.size());

		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}

	private static void dfs(int y, int x, int c) {
		map[y][x] = c;
		cnt++;
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (check(ny, nx) && map[ny][nx] != 1 && map[ny][nx] == 0 && !visited[ny][nx]) {
				visited[ny][nx] = true;
				dfs(ny, nx, c);
			}
		}

	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < M) {
			return true;
		}
		return false;
	}

}
