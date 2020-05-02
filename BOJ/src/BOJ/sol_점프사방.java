package BOJ;

import java.util.Scanner;

public class sol_Á¡ÇÁ»ç¹æ {

	static int[][] map;
	static int T, y, x, n;
	static int[] sy, sx, jump;
	static int v, trap, cnt;
	static int[] dy = { 0, 0, 1, 0, -1 };
	static int[] dx = { 0, 1, 0, -1, 0 };
	static int price;
	static boolean flag;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			y = sc.nextInt(); // map yÁÂÇ¥
			x = sc.nextInt(); // map xÁÂÇ¥
			n = sc.nextInt(); // Âü°¡ÀÚ ¼ö
			map = new int[y + 1][x + 1];
			sx = new int[n];
			sy = new int[n];
			jump = new int[n];
			flag = true;
			for (int i = 1; i <= y; i++) {
				for (int j = 1; j <= x; j++) {
					map[i][j] = sc.nextInt(); // ¼ýÀÚÆÇ
				}
			}

			for (int i = 0; i < n; i++) {
				sy[i] = sc.nextInt(); // Âü°¡ÀÚ yÁÂÇ¥
				sx[i] = sc.nextInt(); // ÂüÀÚ°¡ xÁÂÇ¥
				jump[i] = sc.nextInt(); // Á¡ÇÁ È½¼ö

			}

			trap = sc.nextInt(); // ¹úÁ¡ÀÇ ¼ö
			for (int i = 0; i < trap; i++) {
				int ty = sc.nextInt(); // ¹úÁ¡ÀÇ yÁÂÇ¥
				int tx = sc.nextInt(); // ¹úÁ¡ÀÇ xÁÂÇ¥

				map[ty][tx] = 0;
			}

			price = 1000;

			for (int i = 0; i < n; i++) { // Âü°¡ÀÚ ¹øÈ£

				for (int j = 0; j < jump[i]; j++) {
					v = map[sy[i]][sx[i]] / 10; // ¹æÇâ
					cnt = map[sy[i]][sx[i]] % 10; // Á¡ÇÁ Ä­¼ö
					int iy = map[sy[i]][sx[i]] + dy[v] * cnt;
					int ix = map[sy[i]][sx[i]] + dx[v] * cnt;

					if (!safe(iy, ix) || map[iy][ix] == 0) {
						price -= 1000;
						flag = false;
						break;
					}
					if(flag)	
						price += map[sy[i]][sx[i]] * 100;
					sx[i] = ix;
					sy[i] = iy;
				}
				
			}
			
			System.out.println("#" + test_case + " " + price);

		}

	}

	private static boolean safe(int my, int mx) {
		if (mx >= 0 && my >= 0 && mx < x && my < y)
			return true;
		else
			return false;
	}

}
