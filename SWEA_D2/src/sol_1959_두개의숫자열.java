import java.util.Scanner;

public class sol_1959_두개의숫자열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int[] numA = new int[A];
			int[] numB = new int[B];

			for (int i = 0; i < A; i++) {
				numA[i] = sc.nextInt();
			}
			for (int i = 0; i < B; i++) {
				numB[i] = sc.nextInt();
			}

			int res = 0;
			int res1 = 0;
			int sum;
			if (A < B) {
				for (int i = 0; i < B - A + 1; i++) {
					sum = 0;
					for (int j = 0; j < A; j++) {
						sum += (numA[j] * numB[j+i]);
						
					}
					res = Math.max(res, sum);
				}				
			
			}else if( A > B) {
				for (int i = 0; i < A - B + 1; i++) {
					sum = 0;
					for (int j = 0; j < B; j++) {
						sum += (numA[j+i] * numB[j]);
						
					}
					res = Math.max(res, sum);
				}				
			
				
			}
			System.out.println("#"+test_case+" "+res);
		}
	}
}
