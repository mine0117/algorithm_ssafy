import java.util.Scanner;

public class �����Ѿ���Ǯ�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int cnt = 0;
			System.out.println("#"+test_case);
			for (int i = 0; i < N; i++) {

				char c = sc.next().charAt(0);
				int num = sc.nextInt();
				
				for (int j = 0; j < num; j++) {
					System.out.print(c);
					cnt++;
					if (cnt % 10 == 0) {
						System.out.println();
						cnt = 0;
					}
				}
				
			}
			System.out.println();
			
		}
	}

}
