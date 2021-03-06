import java.util.Scanner;

public class 스도쿠검증 {

	static int[][] map;
	static boolean[] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			map = new int[9][9];

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			boolean flag = true;
			for (int i = 0; i < 9; i++) {
				visited = new boolean[10];
				for (int j = 0; j < 9; j++) {

					if (!visited[map[i][j]]) {
						visited[map[i][j]] = true;

					} else {
						flag = false;
						break;
					}

				}
			}

			for (int i = 0; i < 9; i++) {
				visited = new boolean[10];
				for (int j = 0; j < 9; j++) {
					if (!visited[map[j][i]]) {
						visited[map[j][i]] = true;

					} else {
						flag = false;
						break;
					}
				}
			}
			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					visited = new boolean[10];
					for (int k = 0; k < 3; k++) {
						for (int l = 0; l < 3; l++) {
							if (!visited[map[i + k][j + l]]) {
								visited[map[i + k][j + l]] = true;
							} else {
								flag = false;
								break;
							}
						}
					}
				}
			}
			if (flag) {

				System.out.println("#" + test_case + " " + 1);
			} else {

				System.out.println("#" + test_case + " " + 0);
			}
		}
	}

}
