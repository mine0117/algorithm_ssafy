import java.util.Scanner;

public class sol_5431_민석이의과제체크하기 {

	static int[] arr;
	static int[] checked;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			arr = new int[N + 1];
			checked = new int[N + 1];

			for (int i = 1; i <= K; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 1; i <= N; i++) {
				checked[arr[i]]++;
			}

			System.out.print("#" + test_case + " ");
			for (int i = 1; i <= N; i++) {
				if (checked[i] == 0)
					System.out.print(i + " ");

			}
			System.out.println();

		}
	}

}
