package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Line {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T;

		T = 10;
		HashMap<Character, Character> hm = new HashMap<>();

		hm.put(')', '(');
		hm.put(']', '[');
		hm.put('}', '{');
		hm.put('>', '<');

		for (int test_case = 1; test_case <= T; test_case++) {

			Stack<Character> stack = new Stack<>();

			int input = sc.nextInt();
			String s = sc.next();
			char[] chr = s.toCharArray();
			int bool = 1;
			for (int i = 0; i < input; i++) {

				if (chr[i] == '(' || chr[i] == '[' || chr[i] == '{' || chr[i] == '<') {

					stack.push(chr[i]);
				} else {
					if (hm.get(chr[i]) == stack.peek()) {
						stack.pop();
						
					} else {
						bool = 0;
						break;
					}
				}

			}
			System.out.println("#"+test_case+" "+ bool);
		}

	}

}