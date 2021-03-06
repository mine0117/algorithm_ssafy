import java.util.Scanner;

public class 초심자의회문검사 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();
			int[] arr = new int[str.length()];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i);
			}

			int left = 0;
			int right = arr.length - 1;
			boolean flag = true;
			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[left] == arr[right]) {
					left++;
					right--;
					flag = false;
				} else {
					break;
				}
			}
			if(!flag) {
				System.out.println("#"+test_case+" "+ 1);
			}else {
				System.out.println("#"+test_case+" "+ 0);
			}
			
		}

	}

}
