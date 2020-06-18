package boj_BFS와DFS;

import java.util.Scanner;

public class Main {

	static char[][] map = new char[12][6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 12; i++) {
			String str = sc.next();
			for (int j = 0; j < 6; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 6; j++) {
				if(map[i][j] =='R' ||  map[i][j]=='G'|| map[i][j]=='B' || map[i][j]=='P' || 
						map[i][j]=='Y') {
					
				}
			}
		}
		
	}
}
