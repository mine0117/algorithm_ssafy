import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj_2606_���̷���bfs {

	static int node[][]; // �׷��� �迭
	static int check[]; // �湮 �迭
	static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ��ǻ���� ��
		int m = sc.nextInt(); // ��Ʈ��ũ �� ����Ǿ� �ִ� ��ǻ�� ���� �� ��, ������ ��

		node = new int[n + 1][n + 1];
		check = new int[n + 1];
		for (int i = 0; i < m; i++) { // �׷��� ����
			int a = sc.nextInt();
			int b = sc.nextInt();
			node[a][b] = 1;
			node[b][a] = 1;

		}

		bfs(1);
		System.out.println(cnt);
	}

	static void bfs(int start) { // BFS �޼ҵ�
		Queue<Integer> queue = new LinkedList<>();

		check[start] = 1;
		queue.offer(start);
		cnt = 0; // ���� �� ��ǻ���� ��
		while (!queue.isEmpty()) {
			int x = queue.poll();

			for (int i = 1; i < node.length; i++) { // ���ʴ�� 1���� ���� �� ��ǻ�͵��� ã�� cnt���� ����
				if (node[x][i] == 1 && check[i] != 1) {
					queue.offer(i);
					check[i] = 1;
					cnt++;
				}
			}
		}
		 // ��� Ž���� ��ġ�� cnt ���
	}

}