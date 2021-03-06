import java.util.Scanner;

public class 두개의숫자열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int[] arrA = new int[A];
			int[] arrB = new int[B];

			for (int i = 0; i < A; i++) {
				arrA[i] = sc.nextInt();
			}
			for (int i = 0; i < B; i++) {
				arrB[i] = sc.nextInt();
			}
			int sum = 0;
			int max = Integer.MIN_VALUE;
			if (A > B) {
				for (int i = 0; i < A - B + 1; i++) {
					sum = 0;
					for (int j = 0; j < B; j++) {
						sum += arrA[j + i] * arrB[j];
					}
					max = Math.max(sum, max);
				}
			} else {
				for (int i = 0; i < B - A + 1; i++) {
					sum = 0;
					for (int j = 0; j < A; j++) {
						sum += arrA[j] * arrB[j + i];
					}
					max = Math.max(sum, max);
				}

			}
			System.out.println("#" + test_case + " " + max);
		}
	}

}
