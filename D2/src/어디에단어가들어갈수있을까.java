import java.util.Scanner;

public class ��𿡴ܾ���������� {

	static int T, N, K;
	static int map[][];
	static int cnt, res;
	static boolean flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			K = sc.nextInt();
			map = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				cnt = 0;
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						cnt++;
					} else {
						if (cnt == K) {
							res++;

						}
					}
				}
				if (cnt == K) {
					res++;

				}
			}

			for (int i = 0; i < N; i++) {
				cnt = 0;
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						cnt++;
					} else {
						if (cnt == K) {
							res++;

						}
					}
				}
				if (cnt == K) {
					res++;

				}
			}
			System.out.println("#" + t + " " + res);
		}

	}

}