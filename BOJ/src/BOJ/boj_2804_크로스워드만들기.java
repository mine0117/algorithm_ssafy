package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2804_크로스워드만들기 {
	static char[] arr;
	static char[] arr2;
	static int len, len2;
	
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
		
		map = new char[len2][len];    

		for (int i = 0; i < len2; i++) {
			Arrays.fill(map[i], '.');  // . 으로 초기화 
		}

		loop: for (int i = 0; i < len; i++) {
			for (int j = 0; j < len2; j++) {
				if (arr[i] == arr2[j]) {  // 같은 문자가 있으면 
					map[j] = arr;    // j번째 부터 첫번째 시작
				
					for (int k = 0; k < len2; k++) {
						map[k][i] = arr2[k];  // i번째부터 두번째 입력값 시작
					}
					break loop;
				}

			}

		}

		for (int i = 0; i < len2; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(map[i][j]);    // 출력
			}
			System.out.println();
		}
	}

}
