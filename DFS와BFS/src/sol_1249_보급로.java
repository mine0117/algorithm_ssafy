import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sol_1249_보급로 {
	static int N;
	static int[][] map;
	static int[][] cost;
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new int[N][N];
			cost = new int[N][N];

			for (int i = 0; i < N; i++) {
				String str = sc.next();
				Arrays.fill(cost[i], Integer.MAX_VALUE); //최고 수로 초기화 해주고 최소를 찾음
				for (int j = 0; j < N; j++) {
					map[i][j] = str.charAt(j) - '0';
					
				}
			}

			Queue<int[]> q = new LinkedList<>();
			
			q.offer(new int[] { 0, 0, 0 });
			
			while (!q.isEmpty()) {
				int[] cu = q.poll();

				for (int k = 0; k < 4; k++) {
					int ny = cu[0] + dy[k];
					int nx = cu[1] + dx[k];
					if (range(ny, nx)) {
						int time = cu[2] + map[ny][nx];
						if (cost[ny][nx] > time) {  	// BFS로 이미 방문햇더라도 지금까지 계산한 값이 더작으면 queue에 담음
							cost[ny][nx] = time; 
							q.offer(new int[] { ny, nx, cost[ny][nx] });
						}
					}
				}
			}
			System.out.println("#" + test_case + " " + cost[N - 1][N - 1]);
		}

	}

	private static boolean range(int my, int mx) {
		if (my >= 0 && my < N && mx >= 0 && mx < N) {
			return true;
		}

		return false;
	}
}