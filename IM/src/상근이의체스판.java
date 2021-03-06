import java.util.Arrays;
import java.util.Scanner;

public class 상근이의체스판 {

	static char[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt(); // 5
		int C = sc.nextInt(); // 5
		int A = sc.nextInt(); // 2
		int B = sc.nextInt(); // 3
		int H = R * A; // 10 행
		int W = C * B; // 15 열
		map = new char[H][W];

		for (int i = 0; i < H; i++) {
			Arrays.fill(map[i], '.');
		}
	

		for (int i = 0; i < H; i += A*2) {
			for (int j = 0; j < W; j += B*2) {
				for (int k = 0; k < A; k++) {
					for (int l = 0; l < B; l++) {
						map[i + k][j + l] = 'X';
					}
				}
			}
		}
		
		for (int i = A; i < H; i += A*2) {
			for (int j = B; j < W; j += B*2) {
				for (int k = 0; k < A; k++) {
					for (int l = 0; l < B; l++) {
						map[i + k][j + l] = 'X';
					}
				}
			}
		}
		
		
		
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}
