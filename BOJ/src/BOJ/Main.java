package BOJ;

import java.util.Scanner;

public class Main {
	static int T, H, W, N;
	static char[][] map;
	static char[] arr;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static int d;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			H = sc.nextInt();
			W = sc.nextInt();
			map = new char[H][W];

			for (int i = 0; i < H; i++) {
				String str = sc.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			N = sc.nextInt();
			String str = sc.next();
			for (int i = 0; i < N; i++) {

				char chr = str.charAt(i);
				int ny = 0;
				int nx = 0;

				for (int j = 0; j < H; j++) {
					for (int k = 0; k < W; k++) {
						if (chr == 'U') {
							if (map[j][k] == '^' || map[j][k] == 'v' || map[j][k] == '<' || map[j][k] == '>') {
								map[j][k] = '^';
								d = 0;
								if (j - 1 >= 0 && map[j - 1][k] == '.') {
									map[j - 1][k] = '^';
									map[j][k] = '.';
								}
							}
						} else if (chr == 'D') {
							if (map[j][k] == '^' || map[j][k] == 'v' || map[j][k] == '<' || map[j][k] == '>') {
								map[j][k] = 'v';
								d = 2;
								if (j + 1 < H && map[j + 1][k] == '.') {
									map[j + 1][k] = 'v';
									map[j][k] = '.';
								}
							}
						} else if (chr == 'L') {
							if (map[j][k] == '^' || map[j][k] == 'v' || map[j][k] == '<' || map[j][k] == '>') {
								map[j][k] = '<';
								d = 3;
								if (k - 1 >= 0 && map[j][k - 1] == '.') {
									map[j][k - 1] = '<';
									map[j][k] = '.';
								}
							}
						} else if (chr == 'R') {
							if (map[j][k] == '^' || map[j][k] == 'v' || map[j][k] == '<' || map[j][k] == '>') {
								map[j][k] = '>';
								d = 1;
								if (k + 1 < W && map[j][k + 1] == '.') {
									map[j][k + 1] = '>';
									map[j][k] = '.';
								}
							}
						} else if (chr == 'S') {
							ny = j;
							nx = k;
							while (true) {
								ny += dy[d];
								nx += dx[d];
								if (!isInside(nx, ny) || map[nx][ny] == '#')
									break;
								else if (map[nx][ny] == '*') {
									map[nx][ny] = '.';
									break;
								}
							}
						}
					}

				}
			}
			System.out.print("#" + test_case+" ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}

	}

	public static boolean isInside(int y, int x) {
		return x >= 0 && x < W && y >= 0 && y < H;
	}

}