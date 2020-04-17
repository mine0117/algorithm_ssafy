package IM;

import java.util.Scanner;

public class boj_1244_스위치켜고끄기 {
	static int[] arr;
	static int N, student;
	static int[] sex;
	static int[] number;
	static int left, right, cnt;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		student = sc.nextInt();
		sex = new int[student];
		number = new int[student];

		for (int i = 0; i < student; i++) {
			sex[i] = sc.nextInt();
			number[i] = sc.nextInt();
		}

		for (int i = 0; i < student; i++) {
			if (sex[i] == 1) {
				for (int j = 1; j <= N; j++) {
					if (j % number[i] == 0) {
						if (arr[j] == 0) {
							arr[j] = 1;
						} else {
							arr[j] = 0;
						}
					}
				}
			} else {

				if (arr[number[i]] == 0) {
					arr[number[i]] = 1;
				} else {
					arr[number[i]] = 0;
				}

				cnt = 1;

				for (int j = 1; j <= N; j++) {
					left = number[i] - cnt;
					right = number[i] + cnt;
					if (left >= 1 && right <= N) {
						if (arr[left] == arr[right]) {
							if (arr[left] == 1) {
								arr[left] = arr[right] = 0;
							} else {
								arr[left] = arr[right] = 1;
							}
							cnt++;
						} else {
							break;
						}
					} else {
						break;
					}

				}
				left--;
				right++;
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
	}

}
