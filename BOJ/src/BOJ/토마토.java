package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ≈‰∏∂≈‰ {
	static int N;
	static int M;
	static int[][] box;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static boolean flag = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		box = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				box[i][j] = sc.nextInt();
			}
		}

		bfs();
	}

	static void bfs() {
		Queue<Dot> q = new LinkedList<Dot>();
		int day = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (box[i][j] == 1)
					q.offer(new Dot(i, j, 0));
			}
		}

		while (!q.isEmpty()) {
			Dot dot = q.poll();
			day = dot.day;

			for (int i = 0; i < 4; i++) {
				int nx = dot.x + dx[i];
				int ny = dot.y + dy[i];

				if (ischecked(ny, nx) && box[nx][ny] == 0) {

					box[nx][ny] = 1;
					q.add(new Dot(nx, ny, day + 1));

				}
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (box[i][j] == 0)
					flag = false;
				break;
			}
		}

		if (!flag)
			System.out.println(-1);
		else
			System.out.println(day);
	}

	private static boolean ischecked(int mx, int my) {
		if (my >= 0 && my < M && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}

	static class Dot {
		int x;
		int y;
		int day;

		public Dot(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
}