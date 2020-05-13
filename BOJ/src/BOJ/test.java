package BOJ;

import java.util.*;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[] arr = new int[101];
		int min = 0;
		int max = 0;
		for (int i = 0; i < 3; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			min = Math.min(min, start);
			max = Math.max(max, end);
			for (int j = start; j < end; j++) {
				arr[j]++;
			}
		}
		int sum = 0;
		for (int i = min; i < max; i++) {

			if (arr[i] == 1) {
				sum = sum + A * arr[i];
			} else if (arr[i] == 2) {
				sum = sum + B * arr[i];

			} else if ((arr[i] == 3)) {
				sum = sum + C * arr[i];

			}
		}
		System.out.println(sum);

	}

}
