import java.util.Scanner;

public class BABBA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		int[] arrA = new int[45];
		int[] arrB = new int[45];

		arrA[0] = 1;
		arrA[1] = 0;
		arrB[0] = 0;
		arrB[1] = 1;

		for (int i = 2; i < 45; i++) {
			arrA[i] = arrA[i - 1] + arrA[i - 2];
			arrB[i] = arrB[i - 1] + arrB[i - 2];
		}
		System.out.println(arrA[K - 1] + " " + arrB[K - 1]);
	}
}
