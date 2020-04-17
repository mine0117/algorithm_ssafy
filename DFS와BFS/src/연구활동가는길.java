import java.util.Scanner;

public class 연구활동가는길 {
	static int N, M;
	static int[][] G;
	static boolean[] visited;
	static int min;

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		M = scann.nextInt();
		G = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			int y = scann.nextInt();
			int x = scann.nextInt();
			int v = scann.nextInt();
			G[y][x] = v;
			G[x][y] = v;
		}
		min = Integer.MAX_VALUE;
		go(1, 0);// v, weighted
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		 print(G);
	}

	// 1-> 3-> 7
	private static void go(int v, int w) {
		if (v == N) {
			if (min > w) {
				min = w;
			}
			return;
		}
		for (int i = 1; i < N + 1; i++) {
			if (!visited[i] && G[v][i] != 0) {
				visited[i] = true;
				go(i, w + G[v][i]);   
				visited[i] = false;
			}      
		}

	}
  
	private static void print(int[][] map2) {
		for (int i = 1; i < map2.length; i++) {
			for (int j = 1; j < map2[i].length; j++) {
				System.out.print(map2[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*
 * 7 11 1 2 47 1 3 69 2 4 57 2 5 124 3 4 37 3 5 59 3 6 86 4 6 27 4 7 94 5 7 21 6
 * 7 40
 * 
 * 7 8 1 2 47 1 3 69 2 4 57 2 5 124 3 4 37 3 5 59 3 6 86 4 6 27
 * 
 */
