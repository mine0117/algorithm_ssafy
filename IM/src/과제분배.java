import java.util.Scanner;

public class 과제분배 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int K = sc.nextInt();

			if(N == 0 || K == 0) {
				System.out.println("#" + test_case + " " + 0);
				break;
			}
			
			
			if (N % K == 0) {
				System.out.println("#" + test_case + " " + 0);
			} else if(N % K == N){
				if(N > 0) {
					System.out.println("#" + test_case + " " + 1);	
				}
			
			}else {
				int a = N % K;
				int b = N / K;
				int max = a + b;
				int res = max - b;
				System.out.println("#" + test_case + " " + res);
			}
			
		}

	}

}
