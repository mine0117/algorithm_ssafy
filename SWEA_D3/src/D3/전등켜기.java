package D3;

import java.util.Scanner;

public class 전등켜기 {

	static int[] arr, res;
	static int num, count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			num = sc.nextInt();
			arr = new int[num + 1];
			res = new int[num + 1];

			for (int i = 1; i <= num; i++) {
				res[i] = sc.nextInt();
			}
			count = 0;

			for (int i = 1; i <= num; i++) {

				if (arr[i] != res[i]) {
					count++;
					for (int j = i; j <= num; j++) {
						if (j % i == 0) {
							if (arr[j] == 0)
								arr[j] = 1;
							else if (arr[j] == 1)
								arr[j] = 0;
						}
					}

				}
			}
			System.out.println("#" + test_case + " " + count);
		}

	}

}
