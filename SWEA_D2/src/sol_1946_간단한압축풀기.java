import java.util.Scanner;

public class sol_1946_간단한압축풀기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 1

		for (int test_case = 1; test_case <= T; test_case++) {
			String result = "";
			int N = sc.nextInt(); // 3
			int count = 0;
			for (int i = 0; i < N; i++) {
				char c = sc.next().charAt(0);
				int num = sc.nextInt();

				for (int j = 0; j < num; j++) {
					result += c;
					count++;
					if (count == 10) {
						count = 0;
						result += '\n';
					}

				}

			}

			System.out.println("#" + test_case + " " + result);
		}
	}

}
