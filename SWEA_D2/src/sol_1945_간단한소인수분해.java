import java.util.Scanner;

public class sol_1945_간단한소인수분해 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();

			int count2 = 0;
			int count3 = 0;
			int count5 = 0;
			int count7 = 0;
			int count11 = 0;

			while (N != 1) {

				if (N % 2 == 0) {
					N = N / 2;
					count2++;
				}
				if (N % 3 == 0) {
					N = N / 3;
					count3++;
				}
				if (N % 5 == 0) {
					N = N / 5;
					count5++;
				}
				if (N % 7 == 0) {
					N = N / 7;
					count7++;
				}
				if (N % 11 == 0) {
					N = N / 11;
					count11++;
				}

			}
			System.out.println("#"+test_case + " " + count2 + " " + count3 + " " + count5 + " " + count7 + " " + count11);
		}

	}

}
