package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ¼û¹Ù²ÀÁú {

	static int N, K;
	static int[] map = new int[100001];
	static Queue<Integer> que;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		go();

	}

	private static void go() {
		que = new LinkedList<>();
		que.add(N);
		map[N] = 1;

		while (!que.isEmpty()) {
			N = que.poll();
			if (N == K) {

				break;
			}
			if (N + 1 <= 100000 && map[N + 1] == 0) {
				que.add(N + 1);
				map[N + 1] = map[N] + 1;
			}
			if (N - 1 >= 0 && map[N - 1] == 0) {
				que.add(N - 1);
				map[N - 1] = map[N] + 1;
			}
			if (N * 2 <= 100000 && map[N * 2] == 0) {
				que.add(N * 2);
				map[N * 2] = map[N] + 1;
			}
		}
		System.out.println(map[K] - 1);
	}

}
