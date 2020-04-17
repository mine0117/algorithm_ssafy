import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sol_8658_Summation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			for (int i = 0; i < 10; i++) {

				int num = sc.nextInt();
				System.out.println(num);
				int max = Integer.MAX_VALUE;
				int min = Integer.MIN_VALUE;
				int res = 0;
				while (num > 0) {
					res += num % 10;
					num /= 10;

				}
				if (res > max)
					max = res;
				if (res < min)
					min = res;
			}

		}

	}
}