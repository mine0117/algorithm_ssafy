import java.util.Scanner;

public class IM���� {

	/*
	 * 4 * N int�� �� K �ð� ��� ��Ŀ��� ������ �ִ�. K �ð��� ������ ���� ��Ģ���� ���� ���� Ŀ���ų� �������� Ŀ����. i, j
	 * ����϶� i + j + 1�� k�� ��� �̸� ���� ����ġ K �ð��� ���� ������ ������?
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
