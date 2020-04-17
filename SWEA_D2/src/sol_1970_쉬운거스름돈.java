import java.util.Scanner;

public class sol_1970_쉬운거스름돈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int[] arr = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

			int N = sc.nextInt();
			int [] temp = new int[8];
			
			while(N != 0) {
				
				for (int i = 0; i < arr.length; i++) {
					temp[i] = N/arr[i];
				System.out.println(temp[i]);
					N = N % arr[i];
				}
				
			}
		}
	}

}
