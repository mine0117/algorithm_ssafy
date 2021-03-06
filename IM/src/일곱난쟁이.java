import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ÀÏ°ö³­ÀïÀÌ {
	static boolean c[] = new boolean[9];
	static boolean flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int arr2[] = new int[7];
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		go(arr, arr2, 0, 0);
	}

	public static void go(int arr[], int arr2[], int index, int start) {
		if (flag) {
			return;
		}
		if (index == 7) {
			int sum = 0;
			for (int i = 0; i < 7; i++) {
				sum += arr2[i];
			}
			if (sum == 100) {
				flag = true;
				for (int i = 0; i < 7; i++) {
					System.out.println(arr2[i]);
				}
			}
			return;
		}

		for (int i = start; i < 9; i++) {
			if (c[i])
				continue;
			arr2[index] = arr[i];
			c[i] = true;
			go(arr, arr2, index + 1, i + 1);
			c[i] = false;
		}
	}
}