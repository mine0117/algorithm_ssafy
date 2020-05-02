package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ¿¬±¸¼Ò {

	static int[][] map;
	static int[][] temp;
	static int N, M;

	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static Queue<Point> que;
	static int max;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		temp = new int[N][M];
		max = Integer.MIN_VALUE;
		que = new LinkedList<Point>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		solve(0);

		System.out.println(max);

	}

	private static void solve(int cnt) {

		if (cnt == 3) {
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < M; j++) {
//					temp[i][j] = map[i][j];
//				}
//			}
			for (int i = 0; i < N; i++) 
				System.arraycopy(map[i], 0, temp[i], 0, M);
			
			confirm();
			int res = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (temp[i][j] == 0)
						res++;
				}
			}
			if (max < res)
				max = res;
			return;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					map[i][j] = 1;
					solve(cnt + 1);
					map[i][j] = 0;
				}
			}
		}

	}

	private static void confirm() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (temp[i][j] == 2) {
					que.offer(new Point(i, j));
				}
			}
		}
		while (!que.isEmpty()) {
			int size = que.size();
			for (int s = 0; s < size; s++) {
				Point p = que.poll();
				for (int k = 0; k < 4; k++) {
					int ny = p.y + dy[k];
					int nx = p.x + dx[k];
					if (ischecked(ny, nx) && temp[ny][nx] == 0) {
						temp[ny][nx] = 2;
						que.offer(new Point(ny, nx));
					}
				}
			}
		}
	}

	private static boolean ischecked(int my, int mx) {

		if (mx >= 0 && mx < M && my >= 0 && my < N) {
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
