package com.ssafy.step08.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private Object[] nodes;
	private int lastIndex;
	private final int SIZE;

	public BinaryTree(int size) {

		nodes = new Object[size + 1];
		SIZE = size;

	}

	public boolean isEmpty() {

		return lastIndex == 0;
	}

	public boolean isFull() {
		return lastIndex == SIZE;
	}

	public void add(Object e) { // ��������Ʈ���� ä��
		if (isFull()) {
			System.out.println("��ȭ�����Դϴ�.");
			return;
		}
		nodes[++lastIndex] = e;
	}

	public void searchPreOrder(int index) {
		if (index <= lastIndex) {

			System.out.println(nodes[index] + " "); // v
			searchPreOrder(index * 2); // L
			searchPreOrder(index * 2 + 1); // R

		}
	}

	public void searchInOrder(int index) { // LBR
		if (index <= lastIndex) {
			searchInOrder(index * 2); // L
			System.out.println(nodes[index] + " "); // v
			searchInOrder(index * 2 + 1); // R

		}
	}

	public void searchPostOrder(int index) { // LBR
		if (index <= lastIndex) {
			searchPostOrder(index * 2); // L
			searchPostOrder(index * 2 + 1); // R
			System.out.println(nodes[index] + " "); // v

		}
	}

	public void searchBFS() {
		if (isEmpty())
			return;

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			System.out.print(nodes[cur]+" ");
			if (cur * 2 <= lastIndex)
				queue.offer(cur * 2);
			if (cur * 2 + 1 <= lastIndex)
				queue.offer(cur * 2 + 1);
		}
		System.out.println();
	}

}
