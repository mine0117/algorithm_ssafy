import java.util.Scanner;

public class SWEA_7087_문제제목붙이기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] arr = new int[35];
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				int tmp = str.charAt(0) - '0' - 17;
				arr[tmp] = 1;
			}
			for (int i = 0; i < 35; i++) {
				if (arr[i] == 0)
					break;
				cnt++;
			}
			System.out.println("#" + test_case + " " + cnt);

		}

	}

}
