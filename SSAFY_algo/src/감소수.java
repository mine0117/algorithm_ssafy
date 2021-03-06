import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class °¨¼Ò¼ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int Num = sc.nextInt();
			int a = 0;
			a = Num;
			boolean flag = true;
			int total = 0;
			int res = 0;

			if (Num % 10 == Num) {
				int result = 0;
				result = (Num * Num);
				if (result % 10 <= result / 10) {
					flag = true;
				} else {
					flag = false;
				}

			} else {

				while (Num != 0) {

					res = (res * 10) + (Num % 10);
					Num /= 10;

				}
				total = a * res;

				String s = "" + total;
				int[] num1, num2;
				num1 = new int[s.length()]; // 9 7 6
				num2 = new int[s.length()]; // 6 7 9
				for (int i = 0; i < s.length(); i++) {
					num1[i] = s.charAt(i) - '0';
					num2[i] = s.charAt(i) - '0';
				}

				Arrays.sort(num2);
			
				int temp = 0;
				int left = 0;
				int right = num1.length - 1;

				for (int i = 0; i < num1.length / 2; i++) {
					temp = num1[left];
					num1[left] = num1[right];
					num1[right] = temp;
					left++;
					right--;
				}

				for (int i = 0; i < num1.length; i++) {
					if (num1[i] != num2[i]) {
						flag = false;
					} else {
						flag = true;
					}
				}

			}
			System.out.println("#" + test_case + " " + flag);
		}

	}

}
