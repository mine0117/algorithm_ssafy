package ½Ã¹Ä·¹ÀÌ¼Ç;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Character, Character> hm = new HashMap<>();

		hm.put(')', '(');
		hm.put(']', '[');
		hm.put('}', '{');
		hm.put('>', '<');
		Stack<Character> stack = new Stack<>();

		String str = sc.next();
		char[] chr = str.toCharArray();
		int answer = -1;
		for (int i = 0; i < str.length(); i++) {
			if (chr[i] == '(' || chr[i] == '[' || chr[i] == '{' || chr[i] == '<') {
				stack.push(chr[i]);
			} else {
				if(hm.get(chr[i]) == stack.peek()) {
					stack.pop();
					answer++;
				}else {
					answer = -1;
				}
			}
		}
		System.out.println(answer);
	}

}
