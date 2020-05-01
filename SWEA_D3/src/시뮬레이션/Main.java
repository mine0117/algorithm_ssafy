package 시뮬레이션;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static Queue<Point> que;
	static int res;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			que = new LinkedList<Point>();
			int N = sc.nextInt(); // 총 문서
			int M = sc.nextInt(); // 알고싶은 문서
			res = 0 ;
			for (int i = 0; i < N; i++) { // 문서 입력
				int num = sc.nextInt();
				que.add(new Point(i, num));
			}

			// 입력완료

			int cnt = 0;// 몇번째 출력인가
			solve(M, cnt);
			// while (!que.isEmpty()) {
			// Point p = que.poll();
			//
			//
			// boolean flag = true;
			// Iterator it = que.iterator();
			//
			//
			// }
			System.out.println(res);
		}

	}

	private static void solve(int M, int cnt) {
		while (true) {
			int size = que.size();
			int max = 0;
			// 프린터에 남은것중 가중치 최대값을 찾는거
			for (int i = 0; i < size; i++) {
				Point p = que.poll();
				if (p.pro > max) {
					max = p.pro;
				}
				que.add(p);
			}
			
			while (true) {
				Point p = que.poll();
				if (p.pro == max) {
					cnt++;
					if(p.idx == M) {
						res = cnt;
						return;
					}
					break;
				} else {
					que.add(p);
				}
			}
		}
	}

	public static class Point {
		int idx;
		int pro;

		public Point(int idx, int pro) {
			super();
			this.idx = idx;
			this.pro = pro;
		}

	}

}
