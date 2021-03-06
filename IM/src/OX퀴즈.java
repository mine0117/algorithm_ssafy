import java.util.Scanner;

public class OXÄûÁî {

	static char[] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			map = new char[str.length()];
			for (int j = 0; j < str.length(); j++) {
				map[j] = str.charAt(j);

			}
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				if (map[j] == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}

}
