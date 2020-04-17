package IM;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2804_크로스워드만들기 {

	static char[] a;
	static char[] b;
	static int lenA, lenB;
	static int sa, sb;
	static char[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		lenA = A.length();
		lenB = B.length();
		map = new char[lenB][lenA];
		a = new char[lenA];
		b = new char[lenB];
		for (int i = 0; i < lenA; i++) {
			a[i] = A.charAt(i);
		}
		for (int i = 0; i < lenB; i++) {
			b[i] = B.charAt(i);
		}
		sa = 0;
		sb = 0;
		for (int i = 0; i < lenB; i++) {
			Arrays.fill(map[i], '.');

		}

		loop: for (int i = 0; i < lenA; i++) {
			for (int j = 0; j < lenB; j++) {
				if (a[i] == b[j]) {
					sa = i;
					sb = j;
					break loop;
				}
			}
		}
		for (int i = 0; i < lenA; i++) {
			map[sb][i] = a[i];
		}
		for (int i = 0; i < lenB; i++) {
			map[i][sa] = b[i];
		}
		for (int i = 0; i < lenB; i++) {
			for (int j = 0; j < lenA; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

}
