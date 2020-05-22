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
			// 순열 생성후 ,
			dfs(0);

			// 결과 출력

			System.out.println("#" + test_case + " " + min);
		}
	}

	private static void dfs(int cnt) {
		if (cnt == N) {
			// 인접된 국가가 다른 color로 잘할수 있는 순열인 경우
			if (check()) {
				// 인접된 국가 의 색이 다르게 작성된 순열이 생성된 경우 기존의 color와 생성된 순열이 다른지 카운트
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
		// 중복순열
		for (int i = 1; i <= 4; i++) {
			fill[cnt] = i;
			dfs(cnt + 1);
		}
	}

	private static boolean check() {
		//

		for (int i = 0; i < N; i++) { // cur
			for (int j = 0; j < N; j++) { // 인접국가
				if (map[i][j] == 1 && fill[i] == fill[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
