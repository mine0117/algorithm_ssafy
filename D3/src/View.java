import java.util.Arrays;
import java.util.Scanner;

public class View {

	static int[] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			map = new int[N];

			for (int i = 2; i < N - 2; i++) {
				map[i] = sc.nextInt();
			}
		

			int sum = 0;
			for (int i = 2; i < N - 2; i++) {
				int[] arr = new int[4];
				if (map[i] > map[i - 1] && map[i] > map[i - 2] && map[i] > map[i + 1] && map[i] > map[i + 2]) {
					int a = map[i] - map[i - 1];
					int b = map[i] - map[i - 2];
					int c = map[i] - map[i + 1];
					int d = map[i] - map[i + 2];
					arr[0] = a;
					arr[1] = b;
					arr[2] = c;
					arr[3] = d;
					Arrays.sort(arr);
					int res = map[i] - arr[3];
					sum += res;
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}

}
