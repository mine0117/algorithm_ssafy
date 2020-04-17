import java.util.Scanner;

public class boj_2455_지능형기차 {
	static int[] in;
	static int[] out;
	static int sum, max;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 32 - 0
		out = new int[4]; // 0
		in = new int[4]; // 32
		sum = 0;
		max = 0;
		for (int i = 0; i < 4; i++) {
			in[i] = sc.nextInt();
			out[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			sum += in[i] - out[i];
			if (max > sum)
				sum = max;
		}
		System.out.println(sum);

	}

}
