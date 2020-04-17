import java.util.Arrays;
import java.util.Scanner;

public class sol_1984_중간평균값구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[10];
		for (int test_case = 1; test_case <= T; test_case++) {
			
			for (int i = 0; i < 10; i++) {
				
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			double sum = 0;
		
			for (int i = 1; i < arr.length-1; i++) {
				
				sum += arr[i];
			}
			double a = sum/8;
			int total = (int)Math.round(a); 
			System.out.println("#"+test_case+" "+total);
		}
	}

}
