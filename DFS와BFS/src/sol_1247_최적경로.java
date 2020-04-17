import java.util.Scanner;

public class sol_1247_최적경로 {

	static int[][] map;
	static boolean[] visited;
	static int startx, starty, lastx, lasty, N, min;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			map = new int[N][2];
			visited = new boolean[N];
			startx = sc.nextInt();
			starty = sc.nextInt();

			lastx = sc.nextInt();
			lasty = sc.nextInt();

			min = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				map[i][0] = sc.nextInt();
				map[i][1] = sc.nextInt();

			}
			dfs(startx, starty, 0, 0);
			System.out.println("#" + test_case + " " + min);
		}

	}

	private static void dfs(int x, int y, int v, int cnt) {

		if (cnt == N) {
			v = v + (Math.abs(lastx - x) + Math.abs(lasty - y));
			min = Math.min(v, min);
		}

		for (int d = 0; d < N; d++) {
			if (visited[d] == false) {
				visited[d] = true;
				dfs(map[d][0], map[d][1], v + ((Math.abs(map[d][0] - x) + Math.abs(map[d][1] - y))), cnt + 1);
				visited[d] = false;
			}
		}
	}
}
