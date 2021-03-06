import java.util.Scanner;

public class ÃÖºó¼ö {

	static int[] arr, score;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {

			int N = sc.nextInt();
			int max = Integer.MIN_VALUE;
			arr = new int[1000];
			score = new int[101];
			for (int i = 0; i < 1000; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < 1000; i++) {
				score[arr[i]]++;
			}
			int a = 0;
			for (int i = 0; i <= 100; i++) {
				if (score[i] >= max) {
					max = score[i];
					a = i;
				}
			}
			System.out.println("#" + test_case + " " + a);
		}
	}

}
