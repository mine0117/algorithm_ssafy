import java.util.Scanner;

public class hwalgo0522 {
	public static int result = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] num = new int[N];

			for (int i = 0; i < N; i++) {
				num[i] = sc.nextInt();
			}
			result = 0;
			boolean[] visited = new boolean[N];
			go(num, visited, 0, 0, 0);
			System.out.println("#" + test_case + " " + result);
		}
	}

	public static void go(int[] num, boolean[] visited, int left, int right, int count) {
		if (left < right) {
			return;
		}
		if (count == num.length) {
			result++;
			return;
		}
		for (int i = 0; i < visited.length; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			go(num, visited, left + num[i], right, count + 1);
			go(num, visited, left, right + num[i], count + 1);
			visited[i] = false;
		}
	}
}