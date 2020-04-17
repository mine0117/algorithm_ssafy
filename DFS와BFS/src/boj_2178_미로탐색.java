import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_2178_¹Ì·ÎÅ½»ö {

	static int[][] map;
	static boolean[][] visited;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int N, M;
	static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		bfs(0, 0);

		System.out.println(map[N - 1][M - 1]);

	}

	private static void bfs(int x, int y) {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] { x, y });
		visited[x][y] = true;
		while (!que.isEmpty()) {
			int[] cu = que.poll();

			for (int d = 0; d < 4; d++) {
				int nx = cu[0] + dx[d];
				int ny = cu[1] + dy[d];
				if (check(ny, nx))

					if (check(ny, nx) && map[nx][ny] == 1 && visited[nx][ny] == false) {
						visited[nx][ny] = true;
						map[nx][ny] = map[cu[0]][cu[1]] + 1;
						que.offer(new int[] { nx, ny });
					}

			}

		}

	}

	private static boolean check(int mx, int my) {
		if (mx >= 0 && mx < M && my >= 0 && my < N) {
			return true;
		}
		return false;
	}
}
