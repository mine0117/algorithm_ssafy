package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class 상근날드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] burger = new int[3];
		for (int i = 0; i < 3; i++) {
			burger[i] = sc.nextInt();
		}
		Arrays.sort(burger);
		int[] drink = new int[2];
		for (int i = 0; i < 2; i++) {
			drink[i] = sc.nextInt();
		}
		Arrays.sort(drink);
		int res = ((burger[0] + drink[0])- 50);
		System.out.println(res);
	}

}
