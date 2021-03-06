import java.util.Scanner;

public class 쉬운거스름돈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			int a = N / 50000;
			int temp = N % 50000;
			int b = temp / 10000;
			temp = temp % 10000;
			int c = temp / 5000;
			temp = temp % 5000;
			int d = temp / 1000;
			temp = temp % 1000;
			int e = temp / 500;
			temp = temp % 500;
			int f = temp / 100;
			temp = temp % 100;
			int g = temp / 50;
			temp = temp % 50;
			int h = temp / 10;
			temp = temp % 10;
			System.out.println("#" + test_case);
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h);
		}
	}
}
