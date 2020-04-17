import java.util.Scanner;

public class boj_2606_바이러스 {
	static int N, M, cnt;
	static int[][] map;
	static int visited[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 정점
		M = sc.nextInt(); // 간선
		map = new int[N+1][N+1];
		visited = new int[N+1];
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		dfs(1);
		System.out.println(cnt);
	}

	private static void dfs(int start) {
		visited[start] = 1;
		for (int i = 0; i < N; i++) {
			if (map[start][i] == 1 && visited[i] == 0) {
				dfs(i);
				cnt++;
			}
		}
	}

}
