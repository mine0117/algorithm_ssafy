import java.util.Scanner;

public class °Å½º¸§µ· {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;

		if (N % 5 == 0) {
			System.out.println(N / 5);
		} else {
			while (N != 0) {
				if (N < 0) {
					System.out.println(-1);
					break;
				}
				if (N == 0) {
					System.out.println(cnt);
					break;
				}
				N -= 2;
				cnt++;
				if (N % 5 == 0) {
					cnt += N / 5;
					System.out.println(cnt);
					break;
				}
			}
		}
	}
}