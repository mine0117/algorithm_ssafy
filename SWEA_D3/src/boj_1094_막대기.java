import java.util.Scanner;

public class boj_1094_¸·´ë±â {
	static int len, X;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		len = 64;
		X = sc.nextInt();

		int count = 0;
		int sum = 0;
		while (X > 0) {
			if (len > X) {
				len /= 2;

			} else {
				count++;
				X -= len;
			}

		}
		System.out.println(count);

	}

}
