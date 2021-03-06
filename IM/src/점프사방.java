import java.util.Scanner;

public class 점프사방 {

	static int[] dy = { 0, 0, 1, 0, -1 };
	static int[] dx = { 0, 1, 0, -1, 0 };
	static int y, x, N;
	static int[][] map;
	static int[] startX, startY, cnt;
	static int bcnt, bx, by;
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			y = sc.nextInt();
			x = sc.nextInt();
			N = sc.nextInt();
			map = new int[y + 1][x + 1];
			for (int i = 1; i <= y; i++) {
				for (int j = 1; j <= x; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			startX = new int[N];
			startY = new int[N];
			cnt = new int[N];
			for (int i = 0; i < N; i++) {
				startY[i] = sc.nextInt();
				startX[i] = sc.nextInt();

				cnt[i] = sc.nextInt();

			}
			bcnt = sc.nextInt();
			for (int i = 0; i < bcnt; i++) {
				by = sc.nextInt();
				bx = sc.nextInt();

				for (int j = 1; j <= y; j++) {
					for (int k = 1; k <= x; k++) {
						map[by][bx] = 0;
					}
				}
			}

			// 입력 부
			int sum = 1000;
			for (int i = 0; i < N; i++) {
				int ny = 0; 
				int nx = 0;
				int d = 0;
				int jump = 0;
			
				for (int j = 0; j < cnt[i]; j++) {
				
					d = (map[startY[i]][startX[i]] / 10);
					jump = (map[startY[i]][startX[i]] % 10);

				
					if (d == 1) {
						ny = (startY[i] + dy[d]);
						nx = (startX[i] + dx[d]) + jump;

					} else if (d == 2) {
						ny = (startY[i] + dy[d]) + jump;
						nx = (startX[i] + dx[d]);

					} else if (d == 3) {
						ny = (startY[i] + dy[d]);
						nx = (startX[i] + dx[d]) - jump;

					} else if (d == 4) {
						ny = (startY[i] + dy[d]) - jump;
						nx = (startX[i] + dx[d]);

					}
					
					if (!ischecked(ny, nx) || map[ny][nx] == 0) {
						sum -= 1000;
						break;
					}
					if(ischecked(ny, nx) &&cnt[i] - j == 1) {
						System.out.println(map[ny][nx]);
						sum += map[ny][nx]*100;
						break;
					}

				}
			

			}
			System.out.println("#" + test_case + " " + sum);
		}

	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 1 && my <= y && mx >= 1 && mx <= x) {
			return true;
		}
		return false;
	}
}

/*
 * for (int i = 1; i <= y; i++) { for (int j = 1; j <= x; j++) {
 * System.out.print(map[i][j] + " "); } System.out.println(); }
 */
