import java.util.Scanner;

public class 상호의배틀필드2 {

	static char[][] map;
	static char[] arr;
	static int y, x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			map = new char[H][W];
			for (int i = 0; i < H; i++) {
				String str = sc.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			int N = sc.nextInt();
			String str = sc.next();
			arr = new char[str.length()];
			for (int i = 0; i < N; i++) {
				arr[i] = str.charAt(i);
			}

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '>' || map[i][j] == '<') {
						y = i;
						x = j;
					}
				}
			}
			for (int i = 0; i < N; i++) {
				if (arr[i] == 'U') {
					map[y][x] = '^';
					if (y - 1 >= 0 && map[y - 1][x] == '.') {
						map[y - 1][x] = '^';
						map[y][x] = '.';
						y = y - 1;
					}

				} else if (arr[i] == 'D') {
					map[y][x] = 'v';
					if (y + 1 < H && map[y + 1][x] == '.') {
						map[y + 1][x] = 'v';
						map[y][x] = '.';
						y = y + 1;
					}
				} else if (arr[i] == 'R') {
					map[y][x] = '>';
					if (x + 1 < W && map[y][x + 1] == '.') {
						map[y][x + 1] = '>';
						map[y][x] = '.';
						x = x + 1;
					}
				} else if (arr[i] == 'L') {
					map[y][x] = '<';
					if (x - 1 >= 0 && map[y][x - 1] == '.') {
						map[y][x - 1] = '<';
						map[y][x] = '.';
						x = x - 1;
					}
				} else if (arr[i] == 'S') {
					if (map[y][x] == '^') {
						for (int k = y - 1; k >= 0; k--) {
							if(map[k][x] =='.' || map[k][x] =='-')
								continue;
							
							if (map[k][x] == '*') {
								map[k][x] = '.';
								break;
							}else {
								break;
							}

						}
					} else if (map[y][x] == 'v') {
						for (int k = y + 1; k < H; k++) {
							if(map[k][x] =='.' || map[k][x] =='-')
								continue;

							 if (map[k][x] == '*') {
								map[k][x] = '.';
								break;
							}else {
								break;
							}
						}
					} else if (map[y][x] == '>') {
						for (int k = x + 1; k < W; k++) {
							if(map[y][k] =='.' || map[y][k] =='-')
								continue;
							
							if (map[y][k] == '*') {
								map[y][k] = '.';
								break;
							}else {
								break;
							}
						}
					} else if (map[y][x] == '<') {
						for (int k = x - 1; k >= 0; k--) {
							if(map[y][k] =='.' || map[y][k] =='-')
							continue;
							
							if (map[y][k] == '*') {
								map[y][k] = '.';
								break;
							}else {
								break;
							}
						}
					}
				}

			}
			System.out.print("#" + test_case+" ");
			for (int j = 0; j < H; j++) {
				for (int k = 0; k < W; k++) {
					System.out.print(map[j][k]);
				}
				System.out.println();
			}
		}
	}
}
