
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // ���л�
		int M = sc.nextInt(); // ���л�
		int K = sc.nextInt(); // ���ϚZ

		int cnt = 0;
		while (N >= 2 && M >= 1 & M + N >= 3 + K) {
			N = N - 2;
			M = M - 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
