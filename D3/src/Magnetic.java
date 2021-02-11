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
				int check = 0;// 걸림돌 체크
				for (int i = 0; i < N; i++) {
					if (map[i][j] == 0)
						continue;// 빈칸이면 pass
					else if (check == 0 && map[i][j] == 2) {//
						continue;// 그냥 위로 갈 수 있으므로 pass
					} else if (check == 1 && map[i][j] == 2) {// N극이 위에 있는데 S극이 나오면
						cnt++;
						check = 0;
					} else if (map[i][j] == 1) {// N극이어서 아래로 가야하는 경우
						check = 1;

					}
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}
