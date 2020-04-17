package BOJ;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (5 * j + 3 * i == N) {
					if (cnt > i + j) {
						cnt = i + j;
					}

				}
			}
		}

		if (cnt == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}
	}

}
