import java.util.Arrays;
import java.util.Scanner;

public class ½´ÆÛ¸¶¸®¿À {

	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int max = Integer.MIN_VALUE;

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {

			sum += arr[i];
			if (sum >= 100 || sum <= 100) {
				max = Math.max(max, sum);
			}
			if (max == 100) {
				break;
			}
			a[i] = max;

		}
		

		System.out.println(max);
	}

}
