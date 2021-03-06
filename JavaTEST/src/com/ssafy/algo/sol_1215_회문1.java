package com.ssafy.algo;

import java.util.Scanner;

public class sol_1215_회문1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] s = new String[8][8];

		for (int test_case = 1; test_case <= 1; test_case++) {
			int num = sc.nextInt();

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					s[i][j] = sc.next();
					
				}
			}
			for (int y = 0; y < 8; y++) { // 가로
				for (int x = 0; x < 8; x++) {
					if(s[y][x] != s[8-y][8-x]) {
						
					}
				}
			}
		}

	}

}
