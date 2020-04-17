import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class sol_1219_±Ê√£±‚ {

	static int[] size;
	static int[] size2;
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int a = sc.nextInt();
			int num = sc.nextInt(); // ±Ê¿Ã √—∞πºˆ
			size = new int[100];
			size2 = new int[100];

			for (int i = 0; i < num; i++) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();

				ans = 0;
				if (size[num1] == 0) {
					size[num1] = num2;
				} else
					size2[num1] = num2;

			}
			dfs(0);
			System.out.println("#"+test_case+" "+ans);
		}
	}

	private static void dfs(int v) {
		if (v == 99) {
			ans = 1;
			return;
		}
		if (size[v] != 0) {
			dfs(size[v]);
		}
		if (size2[v] != 0) {
			dfs(size2[v]);
		}

	}
}
