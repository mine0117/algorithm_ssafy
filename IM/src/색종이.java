import java.util.Scanner;

public class »öÁ¾ÀÌ {

	static int[][] map;
	static int N;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };
	static boolean[][] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		map = new int[101][101];
		visited = new boolean[101][101];
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = y; j < y + 10; j++) {
				for (int k = x; k < x + 10; k++) {
					map[j][k] = 1;
				}
			}

		}
/*		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (map[i][j] == 0) {
					
					for (int k = 0; k < 4; k++) {
						int ny = i + dy[k];
						int nx = j + dx[k];
						if (ischecked(ny, nx) && map[ny][nx] == 1) {
						
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}

	private static boolean ischecked(int my, int mx) {
		if (my >= 1 && my <= 100 && mx >= 1 && mx <= 100) {
			return true;
		}
		return false;
	}

}
