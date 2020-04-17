package D3;

import java.util.Scanner;

public class Im½ÃÇè {
	static int width, height, K, sum;
	static int[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			height = sc.nextInt();
			width = sc.nextInt();

			map = new int[height][width];
			K = sc.nextInt();
			sum = 0;
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					for (int k = 1; k <= K; k++) {
						if ((i+j+1)%k == 0) {
							map[i][j] = 1;
						} else {
							map[i][j] = 0;
						}
					}

				}
			}
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}

		//	System.out.println("#" + test_case + " " + sum);

		}

	}

}
