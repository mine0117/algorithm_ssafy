
import java.util.Scanner;

public class 연구활동가는길2 {

	static int N, M;
	static int[][] G;
	static boolean[] visited;
	static int min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		G = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
	
		for (int i = 0; i < M; i++) {
			int y = sc.nextInt();
			int x = sc.nextInt();
			int v = sc.nextInt();
			G[y][x] = v;
			G[x][y] = v;
		}
		min = Integer.MAX_VALUE;
		solve(1,0);
		
	
	
	
	}
	private static void solve(int v, int w) {
		if(v == N) {
			if(min > w) {
				min = w;
			}
			return;
		}
		for (int i = 0; i < N+1; i++) {
			if(!visited[i] && G[v][i] != 0) {
				visited[i] = true;
				solve(i, w+G[v][i]);
				visited[i] = false;
			}
		}
	}
}