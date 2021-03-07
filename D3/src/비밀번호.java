import java.util.LinkedList;
import java.util.Scanner;

public class 비밀번호 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int N = sc.nextInt();
			LinkedList<Integer> list = new LinkedList<>();

			String str = sc.next();
			for (int i = 0; i < N; i++) {
				int tmp = str.charAt(i) - '0';
				list.add(tmp);
			}

			int i = 1;
			while (true) {
				if (list.get(i) == list.get(i - 1)) {
					list.remove(i);
					list.remove(i - 1);
					i = 1;
				} else {
					i++;
				}
				if (i >= list.size()) {
					break;
				}
			}
			System.out.println("#" + test_case + " ");
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j));
			}
			System.out.println();
		}
	}

}
