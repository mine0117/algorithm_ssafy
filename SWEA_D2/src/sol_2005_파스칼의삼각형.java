import java.util.Scanner;

public class sol_2005_�Ľ�Į�ǻﰢ�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int[][] arr = new int[N+1][N+1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					arr[i][0] = 1;
					arr[0][0] = 1;
					if (i == j) {
						arr[i][j] = 1;
					} else  {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}

				}

			}
			System.out.println("#"+test_case);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
