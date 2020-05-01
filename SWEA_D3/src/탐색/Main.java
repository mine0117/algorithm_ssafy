package Å½»ö;

import java.util.Scanner;

public class Main {

	static int[][] map;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		map = new int[5][8];

		for (int i = 1; i <= 4; i++) {
			String str = sc.next();
			for (int j = 0; j < 8; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		int K = sc.nextInt(); // Åé´Ï¹ÙÄû È½¼ö
		for (int i = 0; i < K; i++) {

			int num = sc.nextInt();
			int dir = sc.nextInt();

			go(num, dir);

		}
		int sum = 0;
		if (map[1][0] == 1) {
			sum += 1;
		}
		if (map[2][0] == 1) {
			sum += 2;
		}
		if (map[3][0] == 1) {
			sum += 4;
		}
		if (map[4][0] == 1) {
			sum += 8;
		}
		System.out.println(sum);
	}

	private static void rotate(int num, int dir) {

		if (dir == 1) { // ½Ã°è
			int temp = map[num][7];

			for (int i = 6; i >= 0; i--) {
				map[num][i + 1] = map[num][i];
			}
			map[num][0] = temp;
		} else { // ¹Ý ½Ã°è
			int temp = map[num][0];
			for (int i = 0; i <= 6; i++) {
				map[num][i] = map[num][i + 1];
			}
			map[num][7] = temp;
		}

	}

	private static void go(int num, int dir) {

		if (num == 1) {
			if (map[num][2] != map[2][6]) {
				if (map[2][2] != map[3][6]) {
					if (map[3][2] != map[4][6]) {
						rotate(2, -1 * dir);
						rotate(3, dir);
						rotate(4, -1 * dir);
					} else {
						rotate(2, -1 * dir);
						rotate(3, dir);
					}
				} else {
					rotate(2, -1 * dir);
				}
			}
		} else if (num == 2) {
			if (map[num][6] != map[1][2]) {
				rotate(1, -1 * dir);
			}
			if (map[num][2] != map[3][6]) {
				if (map[3][2] != map[4][6]) {
					rotate(3, -1 * dir);
					rotate(4, dir);
				} else {
					rotate(3, -1 * dir);
				}
			}
		} else if (num == 3) {
			if (map[num][2] != map[4][6]) {
				rotate(4, -1 * dir);
			}

			if (map[num][6] != map[2][2]) {
				if (map[2][6] != map[1][2]) {
					rotate(2, -1 * dir);
					rotate(1, dir);
				} else {
					rotate(2, -1 * dir);
				}
			}

		} else if (num == 4) { // n == 4
			if (map[num][6] != map[3][2]) {
				if (map[3][6] != map[2][2]) {
					if (map[2][6] != map[1][2]) {
						rotate(3, -1 * dir);
						rotate(2, dir);
						rotate(1, -1 * dir);
					}
					else {
						rotate(3, -1 * dir);
						rotate(2, dir);
					}
				}
				else {
					rotate(3, -1 * dir);
				}
			}
		}
		rotate(num, dir);
	}
}
