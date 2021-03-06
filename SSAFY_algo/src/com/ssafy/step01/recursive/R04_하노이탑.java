package com.ssafy.step01.recursive;

import java.util.Scanner;

public class R04_�ϳ���ž {

	static StringBuilder result = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	}

	private static void hanoi(int cnt, int from, int temp, int to) {
		// ���� ����(�ǾƷ����� ��ȣ), ����, �ӽ�, ����

		if (cnt == 0)
			return;

		// ���۱���� n-1 ��� ������ �ӽñ������ �ű�.
		hanoi(cnt - 1, from, to, temp);
		// ���۱���� cnt���� ����������� �ű�
		result.append(cnt + " : " + from + "->" + to + "\n");
		// �ӽñ���� cnt-1 ��� ������ ����������� �ű�.
		hanoi(cnt - 1, temp, from, to);
	}

}
