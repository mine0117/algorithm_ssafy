import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sol_1247_�������2 {

	static int N; // ������ ��
	static int min, CX, CY, HX, HY; // min : �ּ� �̵��Ÿ�, CX,CY : ȸ����ǥ, HX, HY: ����ǥ
	static int[][] customers; //�� N���� ��ǥ

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine().trim());
			customers = new int[N][2]; // [i][0] : x��ǥ, [i][1] : y��ǥ
			min = Integer.MAX_VALUE;

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			CX = Integer.parseInt(st.nextToken());
			CY = Integer.parseInt(st.nextToken());
			HX = Integer.parseInt(st.nextToken());
			HY = Integer.parseInt(st.nextToken());
			
			
			// ���� ��ǥ
			for (int i = 0; i < N; i++) {
				customers[i][0] = Integer.parseInt(st.nextToken());
				customers[i][1] = Integer.parseInt(st.nextToken());
			}

			go(0, 0, CX, CY, 0);

			System.out.println("#" + tc + " " + min);
		}
	}

	private static void go(int count, int visited, int bx, int by, int result) {
		if (result >= min) // ����ġ�� : �������� ������ ó�� ���� ���� �� ���� �̵��ߴ� �Ÿ��� 
							// ���� min ������ ũ�ٸ� �� �̻� ������ �湮�ص� �̵��Ÿ��� Ŀ���ۿ� �����Ƿ� ����ġ��
			return;
		if (count == N) { // ��������
			result += Math.abs(bx - HX) + Math.abs(by - HY);
			if (min > result) {
				min = result;
			}
			return;
		}
		for (int i = 0; i < N; i++) { // ��� �� ���� �� count ��ġ�� �õ�
			if ((visited & 1 << i) == 0) { // visited & 1 << i : i ������ ���� ������ ó���Ǿ����� Ȯ�� :
										   // 0 --> ó���ȵ�, 0 �ƴ� --> ó���Ǿ���
				// visited | (1<<i) : ���� �������¿� i ���� �߰�
				go(count + 1, visited | (1 << i), customers[i][0], customers[i][1],
						result + Math.abs(bx - customers[i][0]) + Math.abs(by - customers[i][1]));
			}
		}

	}
}