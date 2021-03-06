package com.ssafy.step01.recursive;

import java.util.Scanner;

public class R03_FoboMemoTest {

	static long[] call1, call2, memo;

	static long totalCnt1, totalCnt2;

	private static long fibo(int n) { // 메모하지않음
		++call1[n];
		++totalCnt1;
		if (n <= 1)
			return n;

		return fibo(n - 1) + fibo(n - 2);
	}

	private static long fibo2(int n) {
		++call2[n];
		++totalCnt2;
		if (n <= 1)
			return n;
		// n항의 값을 계산 한적이 있었다면(메모 확인) 메모된 값 리턴
		if (memo[n] != 0)
			return memo[n];

		memo[n] = fibo2(n - 1) + fibo2(n - 2);

		return memo[n];
	}

	// 1, 1, 2, 3, 5, 8
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		call1 = new long[N + 1];
		call2 = new long[N + 1];
		memo = new long[N + 1];
		System.out.println(fibo2(N));

		for (int i = 0; i <= N; i++) {
			System.out.println("fibo2(" + i + ") : " + call2[i]);
		}
		System.out.println("call count : " + totalCnt2);
		System.out.println("================================");
		System.out.println(fibo(N));
		for (int i = 1; i <= N; i++) {
			System.out.println("fibo(" + i + ") : " + call1[i]);
		}
		System.out.println("fibo call count: " + totalCnt1);
	}

}