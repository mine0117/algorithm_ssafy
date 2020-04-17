package D3;

import java.util.Scanner;

public class sol_3431_준환이의운동관리 {

	static int L, U, X, res;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int res = 0;
		for (int test_case = 1; test_case <= T; test_case++) {

			L = sc.nextInt();
			U = sc.nextInt();
			X = sc.nextInt();

			if (L >= X) {
				res = L - X;
			} else if (X > L && L < U) {
				res = 0;
			}
			if (U < X) {
				res = -1;
			}
			System.out.println("#" + test_case + " " + res);
		}

	}

}
