import java.util.Arrays;
import java.util.Scanner;

public class Flatten {

	static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {

			map = new int[100];
			int N = sc.nextInt();

			for (int i = 0; i < 100; i++) {
				map[i] = sc.nextInt();
			}
			
			Arrays.sort(map);
			for (int i = 0; i < N; i++) {
			
				map[99]--;
				map[0]++;
				Arrays.sort(map);
			}
			System.out.println("#" + test_case + " " + (map[99] - map[0]));
		}

	}
}
