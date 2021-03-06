import java.util.Arrays;
import java.util.Scanner;

public class 롤케이크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();// 롤케이크 길이
		int N = sc.nextInt();// 방청객의 수
		int answer = 0;// 방청객 번호

		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		int[] lol = new int[L+1];
		int max = 0;
		for (int i = 0; i < N; i++) {// 가장 많은 조각을 받도록 예상되는 방척객

			if (max < arr[i][1] - arr[i][0]) {
				max = arr[i][1] - arr[i][0];
				answer = i + 1;
			}

		}
		System.out.println(answer);

		// 실제로 가장 많은 조각을 받은 방청객 번호출력

		for (int i = 1; i <= N; i++) {
			for (int k = arr[i - 1][0]; k <= arr[i - 1][1]; k++) {
				if (lol[k] == 0) {
					lol[k] = i;
				}

			}
		}
		// for (int i = 0; i < lol.length; i++) {
		// System.out.print(lol[i]+" ");
		// }
		max = 0;
		for (int i = 1; i <= N; i++) {
			
			int count = 0;

			for (int j = 0; j < lol.length; j++) {
				if (lol[j] == i) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				answer = i;
			}
		}
		System.out.println(answer);

	}// eom

}