import java.util.Scanner;

public class 상호의배틀필드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = sc.nextInt();
		for (int t = 1; t <= Test; t++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			char arr[][] = new char[H + 1][W + 1];
			int n = 0;
			int w = 0;
			String s;
			for (int i = 0; i <= H; i++) {
				s = sc.nextLine();
				for (int k = 0; k < s.length(); k++) {
					arr[i][k] = s.charAt(k);
					if (s.charAt(k) == '^' || s.charAt(k) == 'v' || s.charAt(k) == '<' || s.charAt(k) == '>') {
						n = i;
						w = k;
					}
				}
			}
			int num = sc.nextInt();
			sc.nextLine();
			String st = sc.nextLine();
			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) == 'U') {
					arr[n][w] = '^';
					if (n - 1 >= 0 && arr[n - 1][w] == '.') {
						arr[n][w] = '.';
						arr[n - 1][w] = '^';
						n -= 1;

					}
				}
				if (st.charAt(i) == 'D') {
					arr[n][w] = 'v';
					if (n + 1 < H + 1 && arr[n + 1][w] == '.') {
						arr[n][w] = '.';
						arr[n + 1][w] = 'v';
						n += 1;
					}
				}
				if (st.charAt(i) == 'L') {
					arr[n][w] = '<';
					if (w - 1 >= 0 && arr[n][w - 1] == '.') {
						arr[n][w] = '.';
						arr[n][w - 1] = '<';
						w -= 1;
					}
				}
				if (st.charAt(i) == 'R') {
					arr[n][w] = '>';
					if (w + 1 < W + 1 && arr[n][w + 1] == '.') {
						arr[n][w] = '.';
						arr[n][w + 1] = '>';
						w += 1;
					}
				}
				if (st.charAt(i) == 'S') {
					if (arr[n][w] == '^') {
						for (int shot = n - 1; shot >= 0; shot--) {
							if (arr[shot][w] == '.' || arr[shot][w] == '-')
								continue;
							if (arr[shot][w] == '*') {
								arr[shot][w] = '.';
								break;
							} else
								break;
						}
					}
					if (arr[n][w] == 'v') {
						for (int shot = n + 1; shot < H + 1; shot++) {
							if (arr[shot][w] == '.' || arr[shot][w] == '-')
								continue;
							if (arr[shot][w] == '*') {
								arr[shot][w] = '.';
								break;
							} else
								break;
						}

					}
					if (arr[n][w] == '>') {
						for (int shot = w + 1; shot < W + 1; shot++) {
							if (arr[n][shot] == '.' || arr[n][shot] == '-')
								continue;
							if (arr[n][shot] == '*') {
								arr[n][shot] = '.';
								break;
							} else
								break;
						}

					}
					if (arr[n][w] == '<') {
						for (int shot = w - 1; shot >= 0; shot--) {
							if (arr[n][shot] == '.' || arr[n][shot] == '-')
								continue;
							if (arr[n][shot] == '*') {
								arr[n][shot] = '.';
								break;
							} else
								break;
						}

					}
				}

			}
			System.out.print("#" + t + " ");
			for (int i = 1; i <= H; i++) {
				for (int j = 0; j < W; j++)
					System.out.print(arr[i][j]);
				System.out.println();
			}

		}
	}
}
