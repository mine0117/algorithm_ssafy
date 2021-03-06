import java.util.Scanner;

public class 색종이만들기 {

	static int[][] map;
	static int N;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				go(N / 2, N / 2);
			}
		}

	}

	private static void go(int y, int x) {

		if (y <= N / 2 && x <= N / 2) {

		}

	}

}
