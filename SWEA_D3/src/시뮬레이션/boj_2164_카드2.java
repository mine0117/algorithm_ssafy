package 시뮬레이션;

import java.util.Scanner;

public class boj_2164_카드2 {

	static int[] map, dice;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		map = new int[N];
		dice = new int[M];

		int index = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			dice[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			if (index < N ) {
				index += dice[i];

				if (index < N) {
					index += map[index];
				}

			}
			ans++;

		}
		System.out.println(ans);

	}

}
