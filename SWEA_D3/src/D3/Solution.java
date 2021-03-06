package D3;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();
			Stack<Integer> stack = new Stack<>();
			boolean[] visited = new boolean[10];
			for (int i = 0; i < str.length(); i++) {
				int num = str.charAt(i) - '0';

				if (!visited[num]) {
					visited[num] = true;
					stack.push(num);
				} else {
					visited[num] = false;
					if (!stack.isEmpty()) {
						stack.pop();
					}
				}
			}

			System.out.println("#" + test_case + " " + stack.size());
		}
	}

}