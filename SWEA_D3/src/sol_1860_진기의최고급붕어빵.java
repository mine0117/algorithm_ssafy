import java.util.Arrays;
import java.util.Scanner;

public class sol_1860_�������ְ�޺ؾ {

	static int[] arr;
	static boolean flag;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt(); // �մ�
			int M = sc.nextInt(); // ����� �ð�
			int K = sc.nextInt(); // �ؾ ����
			arr = new int[N];

			for (int i = 0; i < N; i++) { // �մԵ� ���� �ð�
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);
			flag = false;
			int total = 0;

			for (int i = 0; i < arr.length; i++) {
				int count = arr[i] / M;
				total = K * count - i - 1;
				if (total < 0) {
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.println("#" + test_case + " Possible");
			else
				System.out.println("#" + test_case + " Impossible");
		}

	}

}

