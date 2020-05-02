package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2804_ũ�ν����常��� {
	static char[] arr;
	static char[] arr2;
	static int len, len2;
	
	static char[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		arr = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);   // ù��° �Է°�
		}
		
		String str2 = sc.next();
		
		arr2 = new char[str2.length()];
		
		for (int i = 0; i < str2.length(); i++) {
			arr2[i] = str2.charAt(i); // �ι�° �Է°�
		}

		len = arr.length;  // ù��° �� ����
		len2 = arr2.length; // �ι�° �� ����
		
		map = new char[len2][len];    

		for (int i = 0; i < len2; i++) {
			Arrays.fill(map[i], '.');  // . ���� �ʱ�ȭ 
		}

		loop: for (int i = 0; i < len; i++) {
			for (int j = 0; j < len2; j++) {
				if (arr[i] == arr2[j]) {  // ���� ���ڰ� ������ 
					map[j] = arr;    // j��° ���� ù��° ����
				
					for (int k = 0; k < len2; k++) {
						map[k][i] = arr2[k];  // i��°���� �ι�° �Է°� ����
					}
					break loop;
				}

			}

		}

		for (int i = 0; i < len2; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(map[i][j]);    // ���
			}
			System.out.println();
		}
	}

}
