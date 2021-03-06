import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class º°ÀÚ¸® {

	static int[][] map;
	static int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };
	static Queue<Point> que;
	static ArrayList<Point> list;
	static boolean[][] visited;
	static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			map = new int[10][10];
			visited = new boolean[10][10];
			list = new ArrayList<>();
			cnt = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			que = new LinkedList<Point>();
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (map[i][j] == 1) {
						que.offer(new Point(i, j));
						

						bfs(i, j);
						
					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}

	}

	private static void bfs(int y, int x) {
		visited[y][x] = true;
		while (!que.isEmpty()) {
			Point p = que.poll();
			for (int k = 0; k < 8; k++) {
				int ny = p.y + dy[k];
				int nx = p.x + dx[k];
				if (ischecked(ny, nx) && !visited[ny][nx] && map[ny][nx] == 1) {
			
					que.offer(new Point(ny, nx));
				
					visited[ny][nx] = true;
					map[ny][nx] = 0;
				}
			}
		}
		cnt++;
		
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < 10 && mx >= 0 && mx < 10) {
			return true;
		}
		return false;
	}

	public static class Point {
		int y;
		int x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}
}
