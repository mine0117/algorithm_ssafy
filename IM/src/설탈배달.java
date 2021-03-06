import java.util.Scanner;

public class ¼³Å»¹è´Þ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		boolean flag = true;
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				if (3 * i + 5 * j == N) {
					sum = i + j;
					min = Math.min(min, sum);
					flag = false;
				}

			}
		}
		if (!flag) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

}
