package BOJ;

import java.util.Scanner;

public class boj_2839_º≥≈¡πË¥ﬁ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (3 * i + 5 * j == N) {
					if (cnt > i + j)
						cnt = i + j;
				}
			}
		}
		if (cnt == Integer .MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}

}
