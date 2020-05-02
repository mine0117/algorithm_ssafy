package BOJ;

import java.util.Scanner;

public class sol_1244_스위치켜고끄기 {

	static int[] arr, se, num;
	static int N, student;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 스위치 갯수
		arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt(); // 처음 스위치 배열 값
		}

		student = sc.nextInt(); // 학생 수
		se = new int[student];
		num = new int[student];
		for (int i = 0; i < student; i++) {

			se[i] = sc.nextInt(); // 성별
			num[i] = sc.nextInt(); // 받은수

		}

		for (int i = 0; i < student; i++) {
			if (se[i] == 1) { // 남자
				for (int j = 1; j <= N; j++) {
					if (j % num[i] == 0) { // 나머지가 0이면 배수
						if (arr[j] == 0) {
							arr[j] = 1; // 0 이면 1로 또는 1이면 0으로
						} else {
							arr[j] = 0;
						}
					}
				}
			} else { // 여자
				if (arr[num[i]] == 1)
					arr[num[i]] = 0; // 받은 숫자를 0 또는 1로 바꾸어줌
				else
					arr[num[i]] = 1;

				int cnt = 1;
				while (true) {
					int left = num[i] - cnt; // 좌
					int right = num[i] + cnt; // 우
					if (left >= 1 && right <= N) { // 범위 체크
						if (arr[left] == arr[right]) { // 좌우 대칭이면
							if (arr[left] == 0) // 좌우대칭이 0이면
								arr[left] = arr[right] = 1;
							else // 좌우 대칭이 1이면
								arr[left] = arr[right] = 0;
							cnt++; // 좌우대칭이 같으면 cnt를 하나씩 증가해서 그 다음 대칭 비교
						} else
							break; // 대칭이 아니면 종료
					} else // 좌우 대칭이 범위를 벗어나면
						break;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}

	}

}
