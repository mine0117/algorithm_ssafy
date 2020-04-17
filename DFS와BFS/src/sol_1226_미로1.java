import java.util.Scanner;

public class sol_1226_¹Ì·Î1 {

	static int[][] map;
	static boolean[][] visited;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	static int x, y, res, d;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {

			int N = sc.nextInt();

			map = new int[16][16];
			visited = new boolean[16][16];

			for (int i = 0; i < 16; i++) {
				String str = sc.next();
				for (int j = 0; j < 16; j++) {
					map[i][j] = str.charAt(j) - '0';
				}
			}
			res = 0;
			for (int i = 0; i < 16; i++) {
				for (int j = 0; j < 16; j++) {
					if (map[i][j] == 2) {
						dfs(i, j);
					}
				}
			}

			

			System.out.println("#" + test_case + " " + res);

		}

	}

	private static void dfs(int y, int x) {
		if (map[y][x] == 3) {
			res = 1;
		}
		for (int d = 0; d < 4; d++) {
			int my = y + dy[d];
			int mx = x + dx[d];
			if (check(my, mx) && map[my][mx] != 1 && !visited[my][mx]) {
				visited[my][mx] = true;
				dfs(my, mx);
			}
		}

	}

	private static boolean check(int my, int mx) {
		if (my >= 0 && my < 16 && mx >= 0 && mx < 16) {
			return true;
		}
		return false;
	}

}