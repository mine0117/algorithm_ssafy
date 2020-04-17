import java.util.Scanner;

public class boj_1697_���ٲ��� {

	static int N, M, min;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // ����
		M = sc.nextInt(); // ����

		min = Integer.MAX_VALUE;
		go(N, 0);
		System.out.println(min);
	}

	private static void go(int temp, int cnt) {

		if (cnt >= min) {
			return;
		}
		if (temp == M) {
			if (cnt < min)
				min = cnt;
			return;
		}

		go(temp - 1, cnt + 1);
		go(temp + 1, cnt + 1);
		go(temp * 2, cnt + 1);

	}

}
