package com.ssafy.algo;

import java.util.Scanner;

public class sol_1217_°ÅµìÁ¦°ö {
	static int count;
	static int num;
	static int M;
	static int N;
	static int result;
	public static void power(int a, int cnt) {
		
		if(cnt == N) {
			System.out.println("#" + num + " " + result);
			return;
		}
		else {
			result = result*a; //  = 2* 2
			power(a,cnt+1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			num = sc.nextInt();
			M = sc.nextInt(); // 2
			N = sc.nextInt(); // 5
			result = M;
			count = 1;
			power(M, count);
		}

	}

}
