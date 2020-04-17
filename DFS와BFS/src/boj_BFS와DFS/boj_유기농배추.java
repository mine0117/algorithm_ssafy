package boj_BFS와DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_유기농배추 {
	static int[][] map;
	static int T, M, N, K;
	static Queue<Point> que;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			M = sc.nextInt(); // 가로의 길이
			N = sc.nextInt(); // 세로의 길이
			K = sc.nextInt(); // 배추의 갯수

			map = new int[N][M];
			que = new LinkedList<Point>();
			for (int i = 0; i < K; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = 1;
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (map[i][j] == 1) {
						que.offer(new Point(i, j));
						map[i][j] = 0;
						cnt++;
						while (!que.isEmpty()) {
							int size = que.size();
							for (int s = 0; s < size; s++) {
								Point p = que.poll();
								for (int k = 0; k < 4; k++) {
									int ny = p.y + dy[k];
									int nx = p.x + dx[k];
									if (check(ny, nx) && map[ny][nx] == 1) {
										map[ny][nx] = 0;
										que.offer(new Point(ny, nx));
									}
								}
							}
						}
					}

				}

			}
			System.out.println(cnt);
		}
	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < M) {
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
