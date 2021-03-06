package ���հ�����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N��M4 {

	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // 1~���� N���� �ڿ���
		M = Integer.parseInt(st.nextToken()); // �ߺ����� M���� �� ����
		arr = new int[M];

		go(1, 0);

	}

	private static void go(int start, int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();
			return;
		}
		for (int i = start; i <= N; i++) {

			arr[cnt] = i;
			go(i, cnt + 1);
		}

	}

}
