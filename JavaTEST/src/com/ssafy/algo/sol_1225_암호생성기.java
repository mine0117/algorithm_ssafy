package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class sol_1225_암호생성기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<Integer> q = new LinkedList<>();

		for (int test_case = 1; test_case <= 8; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < 8; i++) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
			boolean flag = false;

			for (int i = 1; i <= 8; i++) {
				if (q.peek() -i> 0) {
					q.offer(q.poll() - i);
				}else {
					q.poll();
					q.offer(0);
					flag = true;
				}
			}
		}
	}

}
