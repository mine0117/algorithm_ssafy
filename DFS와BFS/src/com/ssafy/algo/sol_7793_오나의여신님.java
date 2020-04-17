package com.ssafy.algo;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sol_7793_오나의여신님 {

	static char[][] map;
	static boolean[][] visited;
	static boolean flag;
	static int N, M, cnt;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static Queue<Point> quedevil, que;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			M = sc.nextInt();
			map = new char[N][M];
			visited = new boolean[N][M];
			cnt = 0;
			flag = false;
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < M; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			quedevil = new LinkedList<>();
			que = new LinkedList<>();
			boolean a = false;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == '*') {
						a = true;
						quedevil.offer(new Point(i, j));
					} else if (map[i][j] == 'S') {
						map[i][j] = '.';
						visited[i][j] = true;
						que.offer(new Point(i, j));
					}
				}
			}
			if (a)
				bfsdevil();
			else
				bfs();
			System.out.println("#" + test_case + " " + (flag ? cnt : "GAME OVER"));
			// if (flag)
			// System.out.println(cnt);
			// else
			// System.out.println("-1");
		}
	}

	private static void bfs() {

		// for (int i = 0; i < N; i++) {
		// for (int j = 0; j < M; j++) {
		// if (visited[i][j])
		// System.out.print("1");
		// else
		// System.out.print("0");
		// }
		// System.out.print("\t");
		// for (int j = 0; j < M; j++) {
		// System.out.print(map[i][j]);
		// }
		// System.out.println();
		// }
		// System.out.println();
		while (!que.isEmpty()) {
			int size = que.size();

			cnt++;
			for (int i = 0; i < size; i++) {
				Point front = que.poll();
				for (int k = 0; k < 4; k++) {
					int ny = front.y + dy[k];
					int nx = front.x + dx[k];
					if (check(ny, nx) && !visited[ny][nx]) {
						if (map[ny][nx] == '.') {
							visited[ny][nx] = true;
							que.offer(new Point(ny, nx));
						} else if (map[ny][nx] == 'D') {

							flag = true;
							que.clear();
							quedevil.clear();
							break;
						}
					}
				}
				if (flag)
					break;

			}
			bfsdevil();

		}

	}

	private static void bfsdevil() {
		while (!quedevil.isEmpty()) {
			int dsize = quedevil.size();
			for (int i = 0; i < dsize; i++) {
				Point dfront = quedevil.poll();
				for (int k = 0; k < 4; k++) {
					int ny = dfront.y + dy[k];
					int nx = dfront.x + dx[k];
					if (check(ny, nx)) {
						if (map[ny][nx] == '.') {
							map[ny][nx] = '*';
							quedevil.offer(new Point(ny, nx));
						}
					}
				}
			}
			bfs();

		}

	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < M) {
			return true;
		}
		return false;
	}

	static class Point {
		int y, x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;

		}
	}
}
