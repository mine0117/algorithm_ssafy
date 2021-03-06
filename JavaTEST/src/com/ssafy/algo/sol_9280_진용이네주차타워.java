package com.ssafy.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sol_9280_진용이네주차타워 {

	static int n, m;

	static int[] R_i;

	static int[] W_i;

	static int[] checked;

	static int[] fare;

	static int total;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		Queue<Integer> queue = new LinkedList<>();

		for (int t = 1; t <= tc; t++) {

			n = sc.nextInt();

			m = sc.nextInt();

			R_i = new int[n]; // 3

			W_i = new int[m]; // 4

			checked = new int[n];
			int[] Car = new int[m * 2];
			total = 0;
			for (int i = 0; i < n; i++) {

				R_i[i] = sc.nextInt();
				System.out.println();
			}

			for (int i = 0; i < m; i++) {

				W_i[i] = sc.nextInt();

			}

			for (int k = 0; k < m * 2; k++) {
				Car[k] = sc.nextInt();

				for (int i = 0; i < n; i++) {

					if (checked[i] == 0) {

						if (Car[i] > 0) {

							checked[i] = Car[i];
 
							break;

						} else {

							queue.add(Car[i]);

							for (int j = 0; j < checked.length; j++) {

								if (Car[j] == -checked[j]) {

									checked[j] = 0;
									total += (R_i[j] * W_i[Car[j] - 1]);

									if (!queue.isEmpty()) {
										checked[j] = queue.poll();
									}
									break;

								}

							}

						}

					}

				}

			}
			System.out.println("#" + t + " " + total);
		}
	}
}