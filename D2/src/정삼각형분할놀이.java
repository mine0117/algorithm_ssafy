import java.util.Scanner;

public class ���ﰢ�����ҳ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int num = 0;

			int numA = A * A;
			int numB = B * B;

			if (numA % numB == 0) {
				num = numA / numB;
			}
			System.out.println("#" + test_case + " " + num);
		}

	}

}
