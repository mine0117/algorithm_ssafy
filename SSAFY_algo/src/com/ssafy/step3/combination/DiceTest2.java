package com.ssafy.step3.combination;

import java.util.Arrays;
import java.util.Scanner;

public class DiceTest2 {

	static int N, totalCnt;
	static int[] input;
	static boolean[] isSelected;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		input = new int[N];
		isSelected = new boolean[N];

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		generateSubset(0);
		System.out.println(totalCnt);

	}

	private static void generateSubset(int cnt) {
		if (cnt == N) {
			totalCnt++;
			for (int i = 0; i < N; i++) {
				System.out.println((isSelected[i] ? input[i] : "X") + "\t");
			}
			System.out.println();
		}

	}

}
