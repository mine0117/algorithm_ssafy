package Å½»ö;

import java.util.Scanner;

public class Main {
	static char[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		map = new char[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				map[i][j] = sc.next().charAt(j);
			}
		}
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if(map[i][j] == 'c') {
					
				}
			}
		}
	}

}
