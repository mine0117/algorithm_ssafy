package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class ¿∑≥Ó¿Ã {

	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int C = sc.nextInt();
		arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int left = 1;
		int right = arr[N-1] -arr[0];
		int d = 0;
		int ans = 0;
		while(left <= right) {
			int mid = (left + right) / 2;
			int start = arr[0];
			
			for (int i = 1; i < N; i++) {
				d = arr[i] - start;
				if(mid <= d) {
		
					start = arr[i];
				}
			}
		}
		
		
	}
}
