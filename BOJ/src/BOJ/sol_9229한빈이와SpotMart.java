package BOJ;

import java.util.Scanner;

public class sol_9229한빈이와SpotMart {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt(); // 테스트 케이스 개수
		for (int i = 1; i <= tc; i++) {
			int max = 0;
			int sum = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			outer: for (int x = 0; x < n; x++) {
				for (int y = x + 1; y < n; y++) {
					sum = arr[x] + arr[y];
					if (sum == m) {
						max = sum;
						break outer;
					}
					if (sum > max && sum < m) {
						max = sum;
					}
				}
			}
			if (max == 0) {
				max = -1;
			}
			System.out.println("#" + i + " " + max);
		}
	}
}