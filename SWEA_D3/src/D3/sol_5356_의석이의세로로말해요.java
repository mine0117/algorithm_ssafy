package D3;

import java.util.Arrays;
import java.util.Scanner;

public class sol_5356_의석이의세로로말해요 {

	static char[][] arr;
	static String str;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			arr = new char[5][15];

			for (int i = 0; i < 5; i++) {
				Arrays.fill(arr[i], '*');
			}

			for (int i = 0; i < 5; i++) {
				String s = sc.next();
				for (int j = 0; j < s.length(); j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			str = "";

			for (int j = 0; j < 15; j++) {
				for (int i = 0; i < 5; i++) {
					if (arr[i][j] != '*')
						str += arr[j][i];

				}
			}

			System.out.println("#" + test_case + " " + str);

		}
	}

}
