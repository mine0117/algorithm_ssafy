import java.util.Scanner;

public class È¸¹®2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int tmp = sc.nextInt();
			int max = 1;
			char[][] a = new char[100][100];
			for (int i = 0; i < 100; i++) {
				String s = sc.next();
				for (int j = 0; j < 100; j++) {
					a[i][j] = s.charAt(j);
				}
			}

			for (int i = 0; i < 100; i++) {
				for (int j = 2; j <= 100; j++) {
					char[] c = new char[j];
					int flag = 0;

					for (int k = 0; k < 100 - j; k++) {
						for (int l = 0; l < j; l++) {
							c[l] = a[i][l + k];
						}

						for (int l = 0; l < j / 2; l++) {
							if (c[l] != c[j - l]) {
								flag = 1;
								break;
							}
						}
						if (flag == 0)
							max = Math.max(max, j);

					}

				}
			}
			System.out.println("#" + t + " " + max);
		}
	}
}