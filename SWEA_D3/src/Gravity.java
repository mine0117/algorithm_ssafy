import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ��� ����
		final int BOX = 1;
		final int EMPTY = 0;

		// ���� ����
		// �̷��� �ϸ� �� �迭�� ���Ҵ� int�� default value�� 0���� �ʱ�ȭ �ȴ�.
		int[][] room = new int[100][100];
		int[] boxTop = new int[100]; // ���� ���� �ִ� ����

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
			// �濡 ���� ä���
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

			// �� ���� ��(column)�� ���� ���� �ִ� ������ ������ ���Ѵ�.
			for (i = 0; i < N; i++) {
				if (boxTop[i] > 0) {
					countEmptySpace = 0;
					for (j = i + 1; j < N; j++) {
						// room[i][j]�� �ڽ� �� �� ��ĭ�� ������ �����ν� ������ ���Ѵ�.
						if (room[j][boxTop[i] - 1] == EMPTY) {
							countEmptySpace += 1;
						}
						// ������ ���� �������� ���� ������ ũ�ٸ� ������Ʈ �Ѵ�.
						if (countEmptySpace > maxFallen)
							maxFallen = countEmptySpace;
					}
				}
			}
			System.out.println(maxFallen);

		}

	}
}
