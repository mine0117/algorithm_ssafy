import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 상수 설정
		final int BOX = 1;
		final int EMPTY = 0;

		// 변수 설정
		// 이렇게 하면 각 배열의 원소는 int의 default value인 0으로 초기화 된다.
		int[][] room = new int[100][100];
		int[] boxTop = new int[100]; // 가장 위에 있는 상자

		int i, j;
		int testCase, T;
		int N, M;
		int maxFallen;
		int countEmptySpace;

		testCase = sc.nextInt();

		for (T = 0; T < testCase; T++) {
			N = sc.nextInt();
			M = sc.nextInt();
			maxFallen = 0;
			// 방에 상자 채우기
			for (i = 0; i < N; i++) {
				boxTop[i] = sc.nextInt();
				for (j = 0; j < boxTop[i]; j++)
					room[i][j] = BOX;
			}
			for (i = 0; i < N; i++) {

				for (j = 0; j < M; j++) {
					System.out.print(room[i][j] + " ");
				}
				System.out.println();
		}

			// 각 상자 열(column)의 가장 위에 있는 상자의 낙차를 구한다.
			for (i = 0; i < N; i++) {
				if (boxTop[i] > 0) {
					countEmptySpace = 0;
					for (j = i + 1; j < N; j++) {
						// room[i][j]가 박스 일 때 빈칸의 개수를 셈으로써 낙차를 구한다.
						if (room[j][boxTop[i] - 1] == EMPTY) {
							countEmptySpace += 1;
						}
						// 이전에 구한 낙차보다 현재 낙차가 크다면 업데이트 한다.
						if (countEmptySpace > maxFallen)
							maxFallen = countEmptySpace;
					}
				}
			}
			System.out.println(maxFallen);

		}

	}
}
