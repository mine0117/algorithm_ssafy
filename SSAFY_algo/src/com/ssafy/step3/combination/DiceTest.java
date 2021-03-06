package com.ssafy.step3.combination;

import java.util.Arrays;
import java.util.Scanner;

public class DiceTest {

	static int N, M, number[], totalCnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		number = new int[N];
		switch (M) {

		case 1: // 주사위 던지기 1 : 중복수열
			dice1(0);
			break;
		}
	}

	private static void dice1(int cnt) {
		if (cnt == N) {
			totalCnt++;
			System.out.println(Arrays.toString(number));
			return;
		}

		for (int i = 1; i <= 6; i++) { // 1 ~ 6
			number[cnt] = i;
			dice1(cnt + 1);
		}
	}

}
