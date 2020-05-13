package BOJ;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 인구이동 {
	static int N, L, R, cnt;
	static int[][] map;
	static boolean[][] visited;
	static Queue<Point> que;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static boolean flag, isPossible;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		L = sc.nextInt();
		R = sc.nextInt();

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		que = new LinkedList<>();
		cnt = 0;
		while (true) {
			isPossible = false;
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (!visited[i][j]) {

						bfs(i, j);
						
					}
				

				}
			}
			if (!isPossible)
				break;

			cnt++;
			
		}
		System.out.println(cnt);
	}

	private static void bfs(int y, int x) {

		que.offer(new Point(y, x));
		ArrayList<Point> al = new ArrayList<Point>();
		while (!que.isEmpty()) {

			Point p = que.poll();
			if(visited[p.y][p.x])	continue;
			al.add(p);

			for (int k = 0; k < 4; k++) {
				int ny = p.y + dy[k];
				int nx = p.x + dx[k];

				if (ischecked(ny, nx) && !visited[ny][nx] && (L <= Math.abs(map[p.y][p.x] - map[ny][nx]))
						&& (Math.abs(map[p.y][p.x] - map[ny][nx]) <= R)) {

					
					Point p2 = new Point(ny, nx);
					que.offer(p2);
//					que.offer(new Point(ny, nx));
//					Point p2 = que.poll();
//					al.add(p2);
//					visited[p.y][p.x] = visited[ny][nx] = true;
					
					isPossible = true;
				}
				
			}
			visited[p.y][p.x] = true;
		
		}
//		for(Point p:al) {
//			System.out.println(p);
//		}
		if (al.size() >= 2) {
			int total = 0;
			for (Point p3 : al) {
				total += map[p3.y][p3.x];
			}
//			System.out.println(total);
//			System.out.println(al.size());
			int avg = total / al.size();
			for (Point p3 : al) {
				map[p3.y][p3.x] = avg;
			}

		}
		
//		print();

	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}

	static class Point {
		int y;
		int x;

		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}

		@Override
		public String toString() {
			return "[" + y + ", " + x + "]";
		}
		
	}
	
	public static void print() {
		for (int f = 0; f < N; f++) {
			for (int i = 0; i < N; i++) {
				System.out.print(map[f][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
