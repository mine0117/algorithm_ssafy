package BOJ;

import java.util.Scanner;

public class boj_2567_»öÁ¾ÀÌ2 {

	static int T;
	static int y, x;
	static int[][] map;
	static int result;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		map = new int[101][101];
	
		for (int test_case = 1; test_case <= T; test_case++) {

			x = sc.nextInt();
			y = sc.nextInt();
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					map[i][j] = 1;
				}
			}
			result = 0;
			for (int i = 0; i < 101; i++) {
				for (int j = 0; j < 101; j++) {
					if (map[i][j] == 0) {
						for (int k = 0; k < 4; k++) {
							int ny = i + dy[k];
							int nx = j + dx[k];
							if (checked(ny, nx) && map[ny][nx] == 1) {
								
								result++;

							}
						}
					}
				}
			}

		}
		System.out.println(result);
	}

	private static boolean checked(int my, int mx) {
		if (my >= 0 && my < 101 && mx >= 0 && mx < 101) {
			return true;
		}
		return false;
	}

}
