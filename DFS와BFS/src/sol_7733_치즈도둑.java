
import java.util.Scanner;

public class sol_7733_Ä¡ÁîµµµÏ {

	static int T, N;
	static int[][] map;
	static boolean[][] visited;
	static int cnt, max;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			map = new int[N][N];

			max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int k = 0; k <= 100; k++) {
				visited = new boolean[N][N];
				int checkcheeze = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (map[i][j] == 0)
							checkcheeze++;
						if (map[i][j] <= k) {
							map[i][j] = 0;
						}
					}
				}
//				if(checkcheeze ==N*N) 
//					break;
				
				cnt = 0;
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if (map[i][j] != 0 && !visited[i][j]) {
							visited[i][j] = true;
							dfs(i, j);
							cnt++;
						}
					}
				}
			//	System.out.println("cnt = " + cnt);
				
				if (max <= cnt)
					max = cnt;
			}
			System.out.println("#" + test_case + " " + max);
		}
	}

//	private static void Print() {
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//	}

	private static void dfs(int y, int x) {
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (checked(ny, nx) && map[ny][nx] != 0 && !visited[ny][nx]) {
				visited[ny][nx] = true;
				dfs(ny, nx);
			}
		}
	}

	private static boolean checked(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}
		return false;
	}

}