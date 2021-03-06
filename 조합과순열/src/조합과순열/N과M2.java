package 조합과순열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N과M2 {

	static int N, M;
	static int[] map;
	static boolean[] isVisted;
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken()); // 1~부터 N까지 자연수
		M = Integer.parseInt(st.nextToken()); // 중복없이 M개를 고른 수열
		map = new int[M];
		isVisted = new boolean[N + 1];

		back(1, 0);
		System.out.println(sb);

	}

	public static void back(int n, int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(map[i] + " ");

			}
			System.out.println();

		} else {
			for (int i = n; i <= N; i++) { // 반복문의 시작 부분을 변경해줘야 한다.
				// 초기에 시작할 때는 두번 째 자리는 2부터 N까지 탐색
				// 3로 시작할 때는 두번 째 자리는 4부터 N까지 탐색
				// 4으로 시작할 때는 두번 째 자리는 5부터 N까지 탐색.. 반복이다.

				if (isVisted[i]) // 이미 방문한 경우는 넘긴다.
					continue;
				map[cnt] = i;
				isVisted[i] = true; // 방문하지 않은 경우는 방문 처리 후
				 // cnt값의 자리는 i로 즉, 초기에는 0번인덱스(첫 번째 자리)는 1이다.
				back(i, cnt + 1); // 현재의 i값보다 큰 경우를 탐색해야 하므로 i를 전달 후 반복문 시작부분에서 +1 해주는 것
				isVisted[i] = false; // 모두 찾은 후에는 다시 방문 여부를 초기화
			}
		}
	}
}
