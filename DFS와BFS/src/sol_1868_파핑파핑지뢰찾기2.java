import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sol_1868_파핑파핑지뢰찾기2 {

	static char[][] map;
	static boolean[][] visited;
	static int[] dy = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };
	static int N, cnt, zx, zy, res;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new char[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			int cnt = 0;
			res = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == '*')
						continue;

					if (map[i][j] == '.') {
						go(i, j);
					}
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] =='.') {
						res++;
					}
				}
			}
			System.out.println("#" + test_case + " " + res);
		}
	}

	private static void go(int y, int x) {
		cnt = 0;
		for (int k = 0; k < 8; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (check(ny, nx) && map[ny][nx] == '*') {
				cnt++;
			}

		}
		if (cnt == 0) {
			zy = y;
			zx = x;
			res++;
			go2(zy, zx);
		}
	}

	private static void go2(int m, int n) {
		int cnt = 0;
		for (int k = 0; k < 8; k++) {
			int ny = m + dy[k];
			int nx = n + dx[k];
			if (check(ny, nx) && map[ny][nx] == '*') {
				cnt++;
			}
		}
		map[m][n] = (char) ('0' + cnt);

		if (cnt == 0) {


			for (int k = 0; k < 8; k++) {
				int ny = m + dy[k];
				int nx = n + dx[k];
				if (check(ny, nx) && map[ny][nx] == '.') {

					go2(ny, nx);
				}
			}

		}
	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}

}