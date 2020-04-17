package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2804_크로스워드만들기2 {
	static char[] arr;
	static char[] arr2;
	static int len, len2;
	static int sy,sx;
	static char[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		arr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);   // 첫번째 입력값
		}
		
		String str2 = sc.next();
		
		arr2 = new char[str2.length()];
		
		for (int i = 0; i < str2.length(); i++) {
			arr2[i] = str2.charAt(i); // 두번째 입력값
		}

		len = arr.length;  // 첫번째 값 길이
		len2 = arr2.length; // 두번째 값 길이
		
		for (int i = 0; i < len2; i++) {
			for (int j = 0; j < len; j++) {
				if(arr[i] == arr[j]) {
					sy = i;
					sx = j;
				}
			}
		}
	}

}
