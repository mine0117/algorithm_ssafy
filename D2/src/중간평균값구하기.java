import java.util.Scanner;

public class 중간평균값구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			int[] arr = new int[10];

			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			int max = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 10; i++) {
				if( max  < arr[i]) {
					max = arr[i];
				}
				if( min > arr[i]) {
					min = arr[i];
				}
			}
		}
	}

}
