import java.util.Scanner;

public class sol_1974_스도쿠검증 {

	static int[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			map = new int[9][9];
			boolean[] checked = new boolean[10];
			boolean flag = true;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					map[i][j] = sc.nextInt();

				}
			}

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (checked[map[i][j]]) // if문에 boolean 들어가면 true
						flag = false; // {} 없을때 1줄만 실행
					checked[map[i][j]] = true;

				}

				checked = new boolean[10];

			}

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (checked[map[j][i]])
						flag = false;
					checked[map[j][i]] = true;

				}
				for (int k = 1; k < 10; k++) {
					checked[k] = false;

				}

			}

			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					for (int k = 0; k < 3; k++) {
						for (int l = 0; l < 3; l++) {
							if (checked[map[i + k][j + l]])
								flag = false;
							checked[map[i + k][j + l]] = true;
						}
					}
					for (int k = 1; k < 10; k++) {
						checked[k] = false;

					}
				}
			}
			if (flag)
				System.out.println("#" + test_case + " 1");
			else
				System.out.println("#" + test_case + " 0");
		}
	}
}
