package 삼성SW역량테스트;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 스타트링크 {
	static int[] map;
	static boolean[] visited;
	static int F, S, G, U, D;
	static int count = 0;
	static int max_conut;
	static Queue<Integer> q = new LinkedList<Integer>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		F = sc.nextInt();
		S = sc.nextInt();
		G = sc.nextInt();
		U = sc.nextInt();
		D = sc.nextInt();

		map = new int[F + 1];
		Arrays.fill(map, -1);
		visited = new boolean[F + 1];
		bfs(S);
		if (map[G] == -1 && S != G) {
			System.out.println("use the stairs");
		} else {
			System.out.println(map[G] + 1);
		}

	}

	static void bfs(int s) {
		q.add(s);
		visited[s] = true;

		while (!q.isEmpty()) {
			count++;
			int t = q.remove();

			if (t == G) {
				return;
			}

			if (t + U <= F && !visited[t + U]) {
				q.add(t + U);
				map[t + U] = map[t] + 1;
				visited[t + U] = true;
			}
			if (t - D >= 1 && !visited[t - D]) {
				q.add(t - D);
				map[t - D] = map[t] + 1;
				visited[t - D] = true;
			}
		}
	}
}
