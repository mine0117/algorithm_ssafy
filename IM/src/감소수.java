import java.util.Arrays;
import java.util.Scanner;

public class °¨¼Ò¼ö {

	static int T, N;
	static int res;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			int c = N;
			int a;
			res = 0;
			int total = 0;
			boolean flag = true;
			if (N % 10 == N) {
				a = N * N;
				if (a / 10 >= a % 10) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				while (N != 0) {

					res = res * 10 + N % 10;
					N /= 10;
				}
				total = c * res;
				String str = "" + total;

				int[] arrA = new int[str.length()];
				int[] arrB = new int[str.length()];
				for (int i = 0; i < str.length(); i++) {
					arrA[i] = str.charAt(i) - '0';
					arrB[i] = str.charAt(i) - '0';
				}

				Arrays.sort(arrB);

				int left = 0;
				int right = arrA.length - 1;
				for (int i = 0; i < arrA.length / 2; i++) {
					int temp = arrA[left];
					 arrA[left] = arrA[right];
					arrA[right] = temp;
					left++;
					right--;
				}

//				for (int i = 0; i < arrA.length; i++) {
//					System.out.print(arrA[i] + " ");
//				}

				for (int i = 0; i < arrB.length; i++) {
					System.out.print(arrB[i] + " ");
				}

				for (int i = 0; i < arrB.length; i++) {
					if (arrA[i] != arrB[i]) {
						flag = false;
					} else {
						flag = true;
					}
				}
			}
			System.out.println(flag);
		}

	}

}
