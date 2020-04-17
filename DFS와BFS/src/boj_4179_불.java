
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_4179_บา {
	static int R, C, cnt;
	static char[][] map;
	static Queue<Point> que;
	static Queue<Point> fire;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static boolean[][] visited;
	static boolean flag;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		visited = new boolean[R][C];
		flag = false;
		cnt = 0;
		for (int i = 0; i < R; i++) {
			char[] temp = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				map[i][j] = temp[j];
			}
		}
		que = new LinkedList<Point>();
		fire = new LinkedList<Point>();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 'J') {
					map[i][j] = '.';
					visited[i][j] = true;
					que.offer(new Point(i, j));
				} else if (map[i][j] == 'F') {
					fire.offer(new Point(i, j));
					// System.out.println("fire i = " + i + ", j = " + j);
				}
			}
		}
		bfs();

		if (flag) {
			System.out.println(cnt);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}

	private static void bfs() {

		loop: while (!que.isEmpty() || !fire.isEmpty()) {

			int fsize = fire.size();
			for (int i = 0; i < fsize; i++) {
				Point f = fire.poll();
				// System.out.println("f.x = " + f.x + ", f.y = " + f.y);
				for (int k = 0; k < 4; k++) {
					int my = f.y + dy[k];
					int mx = f.x + dx[k];
					// System.out.println("ny = " + my + ", nx = " + mx);
					if (my >= 0 && my < R && mx >= 0 && mx < C && map[my][mx] == '.') {
						map[my][mx] = 'F';
						fire.offer(new Point(my, mx));

					}
				}
			}

			int size = que.size();
			cnt++;
			// Print();
			for (int i = 0; i < size; i++) {
				Point p = que.poll();

				for (int k = 0; k < 4; k++) {

					int ny = p.y + dy[k];
					int nx = p.x + dx[k];

					if (ny >= 0 && ny < R && nx >= 0 && nx < C && !visited[ny][nx] && map[ny][nx] == '.') {

						visited[ny][nx] = true;
						que.offer(new Point(ny, nx));
					} else if ((ny < 0 || ny >= R || nx < 0 || nx >= C)) {

						flag = true;
						break loop;
					}

				}
			}

		}

	}

//	private static void Print() {
//		for (int i = 0; i < R; i++) {
//			for (int j = 0; j < C; j++) {
//				if (visited[i][j])
//					System.out.print("1");
//				else
//					System.out.print("0");
//			}
//			System.out.print("\t");
//			for (int j = 0; j < C; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}

	static class Point {
		int y, x;

		public Point(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

	}

}