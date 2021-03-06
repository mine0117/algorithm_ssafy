import java.util.Arrays;
import java.util.Scanner;

public class 크로스워드만들기 {

	static char[][] map;
	static int lenA, lenB;
	static char[] CA, CB;
	static int y, x;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		lenA = A.length();
		lenB = B.length();
		CA = new char[lenA];
		CB = new char[lenB];

		for (int i = 0; i < lenA; i++) {
			CA[i] = A.charAt(i);
		}
		for (int i = 0; i < lenB; i++) {
			CB[i] = B.charAt(i);
		}
		map = new char[lenB][lenA];
		for (int i = 0; i < lenB; i++) {
			Arrays.fill(map[i], '.');
		}

		loop: for (int i = 0; i < lenA; i++) {
			for (int j = 0; j < lenB; j++) {
				if (CA[i] == CB[j]) {
					y = i;
					x = j;
					break loop;
				}

			}

		}
		for (int i = 0; i < lenA; i++) {
			map[x][i] = CA[i];
		}
		for (int i = 0; i < lenB; i++) {
			map[i][y] = CB[i];
		}
		for (int i = 0; i < lenB; i++) {
			for (int j = 0; j < lenA; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}