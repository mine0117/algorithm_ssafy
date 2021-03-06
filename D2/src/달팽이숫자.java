import java.util.Scanner;

public class 달팽이숫자 {

	static int[][] map;
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			map = new int[N][N];
			int d = 0;
			int cnt = 1;
			int y = 0;
			int x = 0;
			int v = N * N;

			while (cnt != v+1) {
 System.out.println(y + " "+ x + " "+cnt);
				if (d == 0) {
					for (int i = x; i < N; i++) {
						if (map[y][i] == 0) {
							map[y][i] = cnt;
							cnt++;
							x = i;
						} else {
							break;
						}

						d = 1;
					}
					if (d == 1) {
						for (int i = y; i < N; i++) {
							if (map[i][x] == 0) {
								map[i][x] = cnt;
								cnt++;
								y = i ;
							} else {

								break;
							}
						}
						d = 2;
					}
					if (d == 2) {
						for (int i = x; i >= 0; i--) {
							if (map[y][i] == 0) {
								map[y][i] = cnt;
								cnt++;
								x = i ;
							} else {

								break;
							}
						}
						d = 2;
					}
					if (d == 3) {
						for (int i = y; i >= 0; i--) {
							if (map[i][x] == 0) {
								map[i][x] = cnt;
								cnt++;
								y = i ;
							} else {

								break;
							}
						}
						d = 0;
					}
				}

			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}

}
