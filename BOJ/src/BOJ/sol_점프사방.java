package BOJ;

import java.util.Scanner;

public class sol_������� {

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

			y = sc.nextInt(); // map y��ǥ
			x = sc.nextInt(); // map x��ǥ
			n = sc.nextInt(); // ������ ��
			map = new int[y + 1][x + 1];
			sx = new int[n];
			sy = new int[n];
			jump = new int[n];
			flag = true;
			for (int i = 1; i <= y; i++) {
				for (int j = 1; j <= x; j++) {
					map[i][j] = sc.nextInt(); // ������
				}
			}

			for (int i = 0; i < n; i++) {
				sy[i] = sc.nextInt(); // ������ y��ǥ
				sx[i] = sc.nextInt(); // ���ڰ� x��ǥ
				jump[i] = sc.nextInt(); // ���� Ƚ��

			}

			trap = sc.nextInt(); // ������ ��
			for (int i = 0; i < trap; i++) {
				int ty = sc.nextInt(); // ������ y��ǥ
				int tx = sc.nextInt(); // ������ x��ǥ

				map[ty][tx] = 0;
			}

			price = 1000;

			for (int i = 0; i < n; i++) { // ������ ��ȣ

				for (int j = 0; j < jump[i]; j++) {
					v = map[sy[i]][sx[i]] / 10; // ����
					cnt = map[sy[i]][sx[i]] % 10; // ���� ĭ��
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
