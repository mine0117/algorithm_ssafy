import java.util.Scanner;

public class Ladder1 {

	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			map = new int[100][100];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			int y = 0;
			int x = 0;
			int d = 0;
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if (map[i][j] == 2) {
						y = i;
						x = j;
						d = 0;
					}
				}
			}
			while (y != 0) {
				if (d == 0) {
					y--;
					if (x - 1 > 0 && map[y][x - 1] == 1) {
						d = 1;
					} else if (x + 1 < 100 && map[y][x + 1] == 1) {
						d = 2;
					}
				} else if (d == 1) {
					x--;
					if (map[y - 1][x] == 1) {
						d = 0;
					}
				} else if (d == 2) {
					x++;
					if (map[y - 1][x] == 1) {
						d = 0;
					}
				}
			}

		}
	}

}
