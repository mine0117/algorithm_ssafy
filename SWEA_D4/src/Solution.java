import java.util.Scanner;

public class Solution {

	static int[][] map;
	static int N;
	static int[] color;
	static int[] fill;
	static int min;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			map = new int[N][N];
			color = new int[N];
			fill = new int[N];
			min = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				color[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			// ���� ������ ,
			dfs(0);

			// ��� ���

			System.out.println("#" + test_case + " " + min);
		}
	}

	private static void dfs(int cnt) {
		if (cnt == N) {
			// ������ ������ �ٸ� color�� ���Ҽ� �ִ� ������ ���
			if (check()) {
				// ������ ���� �� ���� �ٸ��� �ۼ��� ������ ������ ��� ������ color�� ������ ������ �ٸ��� ī��Ʈ
				int count = 0;
				for (int i = 0; i < N; i++) {
					if (color[i] != fill[i]) {
						count++;  
					}
				}
				min = Math.min(count, min);
			}
			return;
		}
		// �ߺ�����
		for (int i = 1; i <= 4; i++) {
			fill[cnt] = i;
			dfs(cnt + 1);
		}
	}

	private static boolean check() {
		//

		for (int i = 0; i < N; i++) { // cur
			for (int j = 0; j < N; j++) { // ��������
				if (map[i][j] == 1 && fill[i] == fill[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
