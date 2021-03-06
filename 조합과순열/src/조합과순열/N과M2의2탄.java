package ���հ�����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N��M2��2ź {

	static int N, M;
	static int[] arr;
	static boolean[] isVisted;
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // 1~���� N���� �ڿ���
		M = Integer.parseInt(st.nextToken()); // �ߺ����� M���� �� ����
		arr = new int[M];


		go(1, 0);
	

	}

	public static void go(int start, int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();

		} else {
			for (int i = start; i <= N ; i++) {
				arr[cnt] = i;
				go(i+1, cnt+1);
			}
		}
	}
}
