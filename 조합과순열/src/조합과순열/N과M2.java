package ���հ�����;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N��M2 {

	static int N, M;
	static int[] map;
	static boolean[] isVisted;
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // 1~���� N���� �ڿ���
		M = Integer.parseInt(st.nextToken()); // �ߺ����� M���� �� ����
		map = new int[M];
		isVisted = new boolean[N + 1];

		back(1, 0);
		System.out.println(sb);

	}

	public static void back(int n, int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(map[i] + " ");

			}
			System.out.println();

		} else {
			for (int i = n; i <= N; i++) { // �ݺ����� ���� �κ��� ��������� �Ѵ�.
				// �ʱ⿡ ������ ���� �ι� ° �ڸ��� 2���� N���� Ž��
				// 3�� ������ ���� �ι� ° �ڸ��� 4���� N���� Ž��
				// 4���� ������ ���� �ι� ° �ڸ��� 5���� N���� Ž��.. �ݺ��̴�.

				if (isVisted[i]) // �̹� �湮�� ���� �ѱ��.
					continue;
				map[cnt] = i;
				isVisted[i] = true; // �湮���� ���� ���� �湮 ó�� ��
				 // cnt���� �ڸ��� i�� ��, �ʱ⿡�� 0���ε���(ù ��° �ڸ�)�� 1�̴�.
				back(i, cnt + 1); // ������ i������ ū ��츦 Ž���ؾ� �ϹǷ� i�� ���� �� �ݺ��� ���ۺκп��� +1 ���ִ� ��
				isVisted[i] = false; // ��� ã�� �Ŀ��� �ٽ� �湮 ���θ� �ʱ�ȭ
			}
		}
	}
}
