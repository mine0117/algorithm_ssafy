package BOJ;

import java.util.Scanner;

public class boj_5585_°Å½º¸§µ· {
	static int cost, money, res;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 500, 100, 50, 10, 5, 1 };
		money = sc.nextInt();
		cost = 1000 - money;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (cost / arr[i] > 0) {
				num += cost / arr[i];
				cost = cost % arr[i];
			}

		}
		System.out.println(num);
	}

}
