package �ＺSW�����׽�Ʈ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	static class Point {
		int y, x, val;

		public Point(int y, int x, int val) {
			this.y = y;
			this.x = x;
			this.val = val;
		}
	}

	static int T;
	static int N;
	static int[][] map;
	static int[] index;
	static int pl;
	static int min;
	static ArrayList<Point> restaurant;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for (int it = 1; it <= T; it++) {
			N = scan.nextInt();
			map = new int[N][N];
			restaurant = new ArrayList<>();
			pl = 0;
			min = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = scan.nextInt();
					if (map[i][j] > 1) {
						restaurant.add(new Point(i, j, map[i][j]));
						pl++;
					}
				}
			}

			for (int i = 1; i <= pl; i++) {
				index = new int[pl];
				combi(pl, i, 0, 0);
			}
			System.out.println("#" + it + " " + min);
		}
	}

	public static void combi(int n, int r, int start, int count) {
		if (count == r) {

			int sum = 0;
			for (int i = 0; i < r; i++) {
				sum += restaurant.get(index[i]).val;
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int mm = Integer.MAX_VALUE;
					if (map[i][j] == 1) {
						for (int c = 0; c < r; c++) {
							int res = Math.abs(restaurant.get(index[c]).y - i)
									+ Math.abs(restaurant.get(index[c]).x - j);
							if (res < mm) {
								mm = res;
							}
						}
						sum += mm;
					}
				}
			}

			if (sum < min) {
				min = sum;
			}
		}
		for (int i = start; i < n; i++) {
			index[count] = i;
			combi(n, r, i + 1, count + 1);
		}
	}

}