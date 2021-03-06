import java.util.Scanner;

public class 스위치켜고끄기 {

	static int[] map;
	static int N, student;
	static int left, right;
	static int cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		map = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			map[i] = sc.nextInt();
		}
		student = sc.nextInt();

		for (int i = 0; i < student; i++) {
			int sex = sc.nextInt();
			int num = sc.nextInt();

			if (sex == 1) {
				for (int j = 1; j <= N; j++) {
					if (j % num == 0) {
						if (map[j] == 1) {
							map[j] = 0;
						} else {
							map[j] = 1;
						}
					}
				}

			} else {
				if (map[num] == 1) {
					map[num] = 0;
				} else {
					map[num] = 1;
				}
				cnt = 1;

				for (int j = 1; j <= N; j++) {
					int left = num - cnt;
					int right = num + cnt;
					if (left >= 1 && right <= N) {
						if (map[left] == map[right]) {
							if (map[left] == 1) {
								map[left] = map[right] = 0;
							} else if (map[left] == 0) {
								map[left] = map[right] = 1;
							}
							cnt++;
						} else {
							break;
						}
					}
				}

			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(map[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}

}
