import java.util.Arrays;
import java.util.Scanner;

public class boj_3109_���� {

	public static int R, C, cnt = 0;
	public static char[][] map;
	public static boolean isFind;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int C = sc.nextInt();
		map = new char[R][C];

		for (int i = 0; i < R; i++) {
			String str = sc.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		//
		for (int i = 0; i < R; i++) {
			isFind = false;
			map[i][0] = 'o';
			dfs(i, 0);
		}

		// output
		System.out.println(cnt);
	}// main

	public static void dfs(int r, int c) {

		if (c == C - 1) {
			isFind = true;
			cnt++;
		}
		
		// ��

		if (!isFind) { // ������ ��θ� ��ã�Ҵٸ�
			if (!isFind && r - 1 >= 0 && map[r - 1][c + 1] == '.') {// ��
				map[r - 1][c + 1] = 'o';

				dfs(r - 1, c + 1);

			}
			if (!isFind && map[r][c + 1] == '.') {// ��
				map[r][c + 1] = 'o';

				dfs(r, c + 1);

			}
			if (!isFind && r + 1 < R && map[r + 1][c + 1] == '.') {// �Ʒ�
				map[r + 1][c + 1] = 'o';

				dfs(r + 1, c + 1);

			}
		}

	}

}