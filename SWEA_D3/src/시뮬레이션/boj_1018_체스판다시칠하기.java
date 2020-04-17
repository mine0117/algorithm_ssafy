package 시뮬레이션;

import java.util.Scanner;

public class boj_1018_체스판다시칠하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int split = 32;
		int compare = 0;
		int cnt = 0;

		if (X == 64) {
			cnt = 1;
		} else {
			while (true) {
				if (X == split + compare) {
					cnt++;
					break;
				} else if (X > split + compare) {
					compare += split;
					cnt++;
					split = split / 2;
				} else if (X < compare + split) {
					split = split / 2;
				}

			}
		}
		System.out.println(cnt);
	}

}
