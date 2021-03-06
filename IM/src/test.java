import java.util.Scanner;

public class test {

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
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (solve(i, j)) {
					flag = true;
				}
					
			}
		}
		if(flag) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		

	}

	private static boolean solve(int y, int x) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				sum1 += map[i][j];
			}
		}
		for (int i = 0; i < y; i++) {
			for (int j = x; j < N; j++) {
				sum2 += map[i][j];
			}
		}

		for (int i = y; i < N; i++) {
			for (int j = 0; j < x; j++) {
				sum3 += map[i][j];
			}
		}

		for (int i = y; i < N; i++) {
			for (int j = x; j < N; j++) {
				sum4 += map[i][j];
			}
		}
		
		if(sum1 !=sum2 || sum1 !=sum3 || sum1 !=sum4 ) {
			return false;
		}
		return true;
	}

}
