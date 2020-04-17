package BOJ;

import java.util.Scanner;

public class sol_1244_����ġ�Ѱ���� {

	static int[] arr, se, num;
	static int N, student;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // ����ġ ����
		arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt(); // ó�� ����ġ �迭 ��
		}

		student = sc.nextInt(); // �л� ��
		se = new int[student];
		num = new int[student];
		for (int i = 0; i < student; i++) {

			se[i] = sc.nextInt(); // ����
			num[i] = sc.nextInt(); // ������

		}

		for (int i = 0; i < student; i++) {
			if (se[i] == 1) { // ����
				for (int j = 1; j <= N; j++) {
					if (j % num[i] == 0) { // �������� 0�̸� ���
						if (arr[j] == 0) {
							arr[j] = 1; // 0 �̸� 1�� �Ǵ� 1�̸� 0����
						} else {
							arr[j] = 0;
						}
					}
				}
			} else { // ����
				if (arr[num[i]] == 1)
					arr[num[i]] = 0; // ���� ���ڸ� 0 �Ǵ� 1�� �ٲپ���
				else
					arr[num[i]] = 1;

				int cnt = 1;
				while (true) {
					int left = num[i] - cnt; // ��
					int right = num[i] + cnt; // ��
					if (left >= 1 && right <= N) { // ���� üũ
						if (arr[left] == arr[right]) { // �¿� ��Ī�̸�
							if (arr[left] == 0) // �¿��Ī�� 0�̸�
								arr[left] = arr[right] = 1;
							else // �¿� ��Ī�� 1�̸�
								arr[left] = arr[right] = 0;
							cnt++; // �¿��Ī�� ������ cnt�� �ϳ��� �����ؼ� �� ���� ��Ī ��
						} else
							break; // ��Ī�� �ƴϸ� ����
					} else // �¿� ��Ī�� ������ �����
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
