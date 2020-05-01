package �ùķ��̼�;

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
			int N = sc.nextInt(); // �� ����
			int M = sc.nextInt(); // �˰���� ����
			res = 0 ;
			for (int i = 0; i < N; i++) { // ���� �Է�
				int num = sc.nextInt();
				que.add(new Point(i, num));
			}

			// �Է¿Ϸ�

			int cnt = 0;// ���° ����ΰ�
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
			// �����Ϳ� �������� ����ġ �ִ밪�� ã�°�
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
