package BOJ;

import java.util.*;

public class 치킨배달 {

	static char[][] map;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int R, C;
	static int cnt;
	static Queue<Point> que, wque;
	static int min;
	static boolean flag;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		map = new char[R][C];
		que = new LinkedList<>();
		wque = new LinkedList<>();
		cnt = 0;
		for (int i = 0; i < R; i++) {
			String str = sc.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		min = Integer.MAX_VALUE;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 'S') {
					que.offer(new Point(i, j));
				} else if (map[i][j] == '*') {
					wque.offer(new Point(i, j));
				}
			}
		}
		bfs();
		if (min == Integer.MAX_VALUE) {
			System.out.println("KAKTUS");
		} else
			System.out.println(min);
		// System.out.println(t);
	}

	private static void bfs() {
		while (!que.isEmpty()) {
			int wsize = wque.size();
			for (int s = 0; s < wsize; s++) {
				Point w = wque.poll();
				for (int k = 0; k < 4; k++) {
					int ny = w.y + dy[k];
					int nx = w.x + dx[k];
					if (ischecked(ny, nx) &&( map[ny][nx] == '.' || map[ny][nx] == 'S')) {
						map[ny][nx] = '*';
						wque.offer(new Point(ny, nx));
					}
				}
			}
			int size = que.size();
			for (int s = 0; s < size; s++) {
				Point p = que.poll();
				for (int k = 0; k < 4; k++) {
					int ny = p.y + dy[k];
					int nx = p.x + dx[k];
					if (ischecked(ny, nx) && map[ny][nx] == '.') {
						map[ny][nx] = 'S';
						que.offer(new Point(ny, nx));

					}

					if (ischecked(ny, nx) && map[ny][nx] == 'D') {
						cnt++;
						min = cnt;
						return;
					}
				}
			}
			cnt++;
		}

	}

	private static boolean ischecked(int my, int mx) {
		if (mx >= 0 && mx < C && my >= 0 && my < R) {
			return true;
		}
		return false;
	}

	static class Point {
		int y;
		int x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

	}
}
