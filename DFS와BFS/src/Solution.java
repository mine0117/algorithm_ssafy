
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	static int[][] map;
	static int T;
	static int sy, sx;
	static int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };
	static Queue<Point> que;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[10][10];

		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					map[i][j] = sc.nextInt();

				}
			}
			int cnt = 0;
			que = new LinkedList<Point>();
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (map[i][j] == 1) {
						que.offer(new Point(i, j));
						map[i][j] = 0;
						cnt++;
						while (!que.isEmpty()) {
							int size = que.size();
							for (int s = 0; s < size; s++) {
								Point p = que.poll();
								for (int k = 0; k < 8; k++) {
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
System.out.println("#"+test_case+" "+ cnt);
		}

	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < 10 && mx >= 0 && mx < 10) {
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
