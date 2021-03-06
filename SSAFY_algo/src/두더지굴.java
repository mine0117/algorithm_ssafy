import java.util.Scanner;

public class 두더지굴 {

	static int N;
	static int cnt;
	static int[][] map;

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N = scann.nextInt();
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = scann.nextInt();
			}
		}
		cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					cnt++; // 군 1 2,3,4
					godfs(i, j, cnt + 1);
				}
			}
		}

		print(map);
	}

	public static void godfs(int y, int x, int c) {
	
		if (safe(y - 1, x) && map[y - 1][x] == 1) {// 위
			godfs(y - 1, x, c);
		}
		if (safe(y + 1, x) && map[y + 1][x] == 1) {// 하
			godfs(y + 1, x, c);
		}
		if (safe(y, x - 1) && map[y][x - 1] == 1) {//
			godfs(y, x - 1, c);
		}
		if (safe(y, x + 1) && map[y][x + 1] == 1) {//
			godfs(y, x + 1, c);
		}
	}

	public static boolean safe(int y, int x) {
		if (y >= 0 && y < N && x >= 0 && x < N) {
			return true;
		} else
			return false;
	}

	public static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}