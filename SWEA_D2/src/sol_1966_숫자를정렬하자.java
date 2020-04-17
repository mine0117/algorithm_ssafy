import java.util.Arrays;
import java.util.Scanner;


public class sol_1966_숫자를정렬하자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			int[] arr = new int [num];
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
				
			}
			Arrays.sort(arr);
			System.out.print("#"+test_case+" ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");	
			}
			System.out.println();
			
		}
	}

}
