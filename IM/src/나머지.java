import java.util.Scanner;

public class ³ª¸ÓÁö {

	static int[] visited;
	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		visited = new int[10];
		arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			visited[i] = arr[i] % 42;
		}
		int[] flag = new int[42];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 42; j++) {
				flag[visited[i]]++;
			}
		}
		int cnt = 0;
		for (int i = 0; i < 42; i++) {
			if (flag[i] != 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
