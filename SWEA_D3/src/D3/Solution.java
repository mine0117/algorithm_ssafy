package D3;



import java.util.Scanner;

public class Solution {
	static int T, N, Q;
	static int[] arr;
	static int L, R;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();
			Q = sc.nextInt();
			arr = new int[N + 1];
			for (int i = 0; i <= Q; i++) {
				L = sc.nextInt();
				R = sc.nextInt();
				for (int j = L; j <= R; j++) {

					arr[j] = i;

				}
			}
			System.out.print("#"+test_case+" ");
			for (int i = 1; i <= N; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}