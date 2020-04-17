package BOJ;

import java.util.Scanner;

public class boj_3985_롤케이크 {
	static int start, end;
	static int L, N;
	static int sum, man1 = 0;
	static int real = 0, man2 = 0;
	static int expect_num, count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		L = sc.nextInt(); // 롤케이크 길이
		N = sc.nextInt(); // 방청객 수
		boolean[] flag = new boolean[L + 1]; // 확인체크

		expect_num = 0; // 기대값

		for (int i = 1; i <= N; i++) {
			start = sc.nextInt(); // 시작
			end = sc.nextInt(); // 끝
			sum = end - start; //
			if (sum > expect_num) {
				expect_num = sum;
				man1 = i; 
			}

			count = 0;
			for (int j = start; j <= end; j++) {
				if (flag[j] == true) {
					continue;
				} else {
					flag[j] = true;
					++count;

				}

			}

			if (count > real) {
				real = count;
				man2 = i;

			}
		}
		System.out.println(man1); 
		System.out.println(man2);
	}
}