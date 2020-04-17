import java.util.Scanner;

public class sol_1986_지그재그숫자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			int [] arr = new int[num+1];
			int [] ab = new int[num];
			for (int i = 1; i < arr.length; i++) {
				arr[i] = i;
				
				if(arr[i] % 2 == 0) {
					arr[i] = -arr[i];
				}
				arr[i] = arr[i];
			
			}
			int sum= 0;
			for (int i = 1; i < arr.length; i++) {
				sum +=arr[i];
			}
			System.out.println("#"+test_case+" "+sum);
		}
	}

}
