import java.util.Scanner;

public class sol_7194_ȭ�����ǹ̻������ {

	public static int E, S, T, A, B;
	public static String[] sn;
	public static int[] tm;
	static int min;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		E = sc.nextInt();

		for (int iT = 1; iT <= E; iT++) {
			S = sc.nextInt(); //�ʱ� �̻���
			T = sc.nextInt(); // ��ǥ �̻���
			A = sc.nextInt(); // a��ŭ �ø�
			B = sc.nextInt(); // b�踸ŭ �ø�
			min = Integer.MAX_VALUE;
			if (B == 1) {
				if ((T - S) % A == 0) {
					min = (T - S) / A;
				} else {
					min = Integer.MAX_VALUE;
				}
			} else {
				dfs(T, 0);
			}
			System.out.printf("#%d %d\n", iT, min == Integer.MAX_VALUE ? -1 : min);
		}
	}

	public static void dfs(int temp, int count) {
		if (temp == S) {
			if (min > count) {
				min = count;
			}
			return;
		}
		if (temp < S) {
			return;
		}
		if (temp % B == 0) {
			if (temp / B < S) {
				dfs(temp - A, count + 1);
			} else {
				dfs(temp / B, count + 1);
			}
		} else {
			dfs(temp - A, count + 1);
		}
	}
}