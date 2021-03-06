import java.util.Scanner;

public class ½ºÄ³³Ê {

	static char[][] map, arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		int C = sc.nextInt();
		int ZR = sc.nextInt();
		int ZC = sc.nextInt();
		map = new char[R][C];

		for (int i = 0; i < R; i++) {
			String str = sc.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < R; ++i) {
			for (int j = 0; j < ZR; ++j) {

				for (int k = 0; k < C; ++k) {
					for (int l = 0; l < ZC; ++l) {
						System.out.print(map[i][k]);
					}

				}
				System.out.println();

			}

		}

	}

}
