import java.util.Scanner;

public class boj_2630_색종이만들기 {

	public static int[][] arr;
	public static int white, blue;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		search(0, 0, n);

		System.out.println(white);
		System.out.println(blue);
	}

	public static void search(int x, int y, int range) {
		int range_temp = range / 2;
		if (!check_WhiteColor(x, y, range) && !check_BlueColor(x, y, range)) {
			search(x, y, range_temp);
			search(x + range_temp, y, range_temp);
			search(x, y + range_temp, range_temp);
			search(x + range_temp, y + range_temp, range_temp);
		}
	}

	public static boolean check_WhiteColor(int x, int y, int range) {
		for (int i = x; i < x + range; i++) {
			for (int j = y; j < y + range; j++) {
				if (arr[i][j] != 0) {
					return false;
				}
			}
		}
		white++;
		return true;
	}

	public static boolean check_BlueColor(int x, int y, int range) {
		for (int i = x; i < x + range; i++) {
			for (int j = y; j < y + range; j++) {
				if (arr[i][j] != 1) {
					return false;
				}
			}
		}
		blue++;
		return true;
	}

}
