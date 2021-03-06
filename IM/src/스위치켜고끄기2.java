import java.util.Scanner;

public class 스위치켜고끄기2 {

	static int[] arr;
	static int[] sex;
	static int[] num;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N+1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		int student = sc.nextInt();
		int sex;
		int num;
		for (int i = 0; i < student; i++) {
			sex = sc.nextInt();
			num = sc.nextInt();

			if (sex == 1) {

				for (int j = 1; j <= N; j++) {
					if (j % num == 0) {
						if (arr[j] == 1) {
							arr[j] = 0;
						} else {
							arr[j] = 1;
						}
					}
				}
			} else {

				if (arr[num] == 1) {
					arr[num] = 0;
				} else {
					arr[num] = 1;
				}
				int cnt = 1;
				for (int j = 1; j <= N; j++) {

					int left = num - cnt;
					int right = num + cnt;
					if (left >= 1 && right <= N) {
						if (arr[left] == arr[right]) {
							if (arr[left] == 1) {
								arr[left] = arr[right] = 0;
							} else {
								arr[left] = arr[right] = 1;
							}
							cnt++;
						} else {
							break;
						}
					}

				}
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
