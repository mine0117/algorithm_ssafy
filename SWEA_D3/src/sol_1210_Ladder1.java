import java.util.Scanner;

public class sol_1210_Ladder1 {

	static int T;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int d = 0;

		int[][] ladder = new int[100][100];

		for (int t = 1; t <= 10; t++) {
			T = sc.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladder[i][j] = sc.nextInt();

					if (ladder[i][j] == 2) {
						x = j;
						y = i;
						d = 0;
					}
				}
			}
			while (y != 0) {
				if (d == 0) {
					y--;
					if (x - 1 > 0 && ladder[y][x - 1] == 1) { // ¿ŞÂÊ
						d = 1;
					} else if (x + 1 < 100 && ladder[y][x + 1] == 1) { // ¿À¸¥ÂÊ
						d = 2;
					}

				} else if (d == 1) {
					x--;
					if (ladder[y - 1][x] == 1) {
						d = 0;
					}
				} else if (d == 2) {
					x++;
					if (ladder[y - 1][x] == 1) {
						d = 0;
					}
				}
			}
			System.out.print("#" + t + " " + x);
			System.out.println();
		}

	}
}