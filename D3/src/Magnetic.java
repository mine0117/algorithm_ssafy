import java.util.Scanner;

public class Magnetic {

	static int[][] map;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			map = new int[N][N];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int cnt = 0;
			for (int j = 0; j < N; j++) {
				int check = 0;// �ɸ��� üũ
				for (int i = 0; i < N; i++) {
					if (map[i][j] == 0)
						continue;// ��ĭ�̸� pass
					else if (check == 0 && map[i][j] == 2) {//
						continue;// �׳� ���� �� �� �����Ƿ� pass
					} else if (check == 1 && map[i][j] == 2) {// N���� ���� �ִµ� S���� ������
						cnt++;
						check = 0;
					} else if (map[i][j] == 1) {// N���̾ �Ʒ��� �����ϴ� ���
						check = 1;

					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
