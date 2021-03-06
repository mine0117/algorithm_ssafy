import java.util.Scanner;

public class IM기출 {

	/*
	 * 4 * N int형 맵 K 시간 모든 행렬에는 전구가 있다. K 시간에 다음과 같은 규칙으로 꺼진 불이 커지거나 꺼진불이 커진다. i, j
	 * 행렬일때 i + j + 1이 k의 배수 이면 전구 스위치 K 시간떄 켜진 전구의 갯수는?
	 */

	static int[][] map;
	static int T,N;
	static int K;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();
			map = new int[4][N];
			for (int s = 1; s <= K; s++) {
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < N; j++) {
						if ((i + j + 1) % s == 0) {
							if (map[i][j] == 1) {
								map[i][j] = 0;
							} else {
								map[i][j] = 1;
							}
						}
					}
				}
			}

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

			int cnt = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						cnt++;
					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}

	}

}
